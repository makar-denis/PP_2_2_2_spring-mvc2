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
@RequestMapping("/cars")
public class CarsController {

    private ServisCars servisCars;

    @Autowired
    public CarsController(ServisCars servisCars) {
        this.servisCars=servisCars;
    }

//    @GetMapping
//    public String allCars(ModelMap model) {
//        //Получаем все машины и передаем их на представление
//
//        model.addAttribute("listCars", servisCars.allCars());
//
//        return "cars";
//    }
//
//    @GetMapping("/{id}")
//    public String numberCars(@PathVariable("id") int id, ModelMap model){
//        //Получаем нужное количество машин и передаем их на представление
//        model.addAttribute("listCars", servisCars.countCars(id));
//        return "cars";
//    }

        @GetMapping
    public String allCars(@RequestParam(value = "count", defaultValue="5") int id, ModelMap model) {
        model.addAttribute("listCars", servisCars.countCars(id));
        return "cars";
        }
}
