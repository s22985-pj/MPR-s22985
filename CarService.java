package pl.pjatk.factory;

import org.springframework.stereotype.Service;

@Service

public class CarService {

    public Car buildCar(String marka, String model) {
        Car car = new Car("LA7W", 100, 1000, model, marka, 4);
    return car;
    }




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
