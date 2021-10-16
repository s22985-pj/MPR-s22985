package pl.pjatk.factory;

public class CarService {

    public void print(Car car){
        System.out.println(car);

    }

    public void addWhell(Car car){

        if (car.getWheels() > 5)
             car.getWheels();
        else
             car.setWheels(car.getWheels()+1);

    }

}
