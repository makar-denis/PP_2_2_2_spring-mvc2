package web.Servis;

import org.springframework.stereotype.Component;
import web.models.Cars;
import java.util.ArrayList;
import java.util.List;

@Component
public class ServisCars {
    private List<Cars> listCars = new ArrayList<>();

    public ServisCars(List<Cars> listCars) {
        this.listCars = listCars;
        Cars car1 = new Cars(1, "Audi", "A1");
        Cars car2 = new Cars(2, "Audi", "A2");
        Cars car3 = new Cars(3, "Audi", "A3");
        Cars car4 = new Cars(4, "Audi", "A4");
        Cars car5 = new Cars(5, "Audi", "A5");
        Cars car6 = new Cars(6, "Audi", "A6");
        listCars.add(car1);
        listCars.add(car2);
        listCars.add(car3);
        listCars.add(car4);
        listCars.add(car5);
        listCars.add(car6);
    }

    public List<Cars> allCars(){
        return listCars;
    }

    public List<Cars> countCars(){
        return listCars;
    }
    public List<Cars> countCars(int i){
        List<Cars> numberCars = new ArrayList<>();
        if (i<5){
            for (int j=0; j<i; j++){
                numberCars.add(listCars.get(j));
            }
        } else {
            numberCars.addAll(listCars);
        }
        return numberCars;
    }

}
