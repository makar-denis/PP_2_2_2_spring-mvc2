package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Servis.ServisCars;
import web.models.Cars;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/")
public class CarsController {

    private ServisCars servisCars;

    @Autowired
    public CarsController(ServisCars servisCars) {
        this.servisCars = servisCars;
    }

    @GetMapping("cars")
    public String allCars(@RequestParam(value = "count", required = false, defaultValue = "0") int i, ModelMap model) {
        model.addAttribute("listCars", servisCars.countCars(i));
        return "cars";
    }
}
