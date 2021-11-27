package pl.pjatk.factory;

import org.apache.catalina.valves.rewrite.InternalRewriteMap;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }


    public Car buildCar(String marka, String model) {

        Car car = new Car("LA7W", 100, 1000, model, marka, 4);
        return carRepository.save(car);
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
    public void changeVmax(Car car){
        if (car.getvMax() < 180)
            car.getvMax();
        else  car.setvMax(car.getvMax()+100);
    }

    public void checkWheels(Car car){
        if (car.getWheels() == 5)
            car.getWheels();
        else addWhell(car);
    }



    public String changeMarka(Car car, String marka){
        if (car.getMarka() == null || car.getMarka().isBlank()){
            car.setMarka(marka);
        }
        return car.getMarka();
    }

    public String changeModel(Car car, String model){
        if (car.getModel() == null || car.getModel().isBlank()){
            car.setMarka(model);
        }
        return car.getModel();
    }

//    public void multiplyCapacity(Car car){
//        int capacity = car.getCapacity() * 3;
//        car.setCapacity(capacity);
//    }

    public boolean isValisMarka(Car car){
        if (car.getMarka() != null && car.getMarka().length() > 5){
            return true;
        } else {
            throw new RuntimeException();
        }
    }


    public Car FindbyId(Long id) {
        Optional<Car> byId = carRepository.findById(id);
        Car byIdFlat = carRepository.findById(id).get();
        if (byIdFlat != null){
            return byIdFlat;
        } else {

        }

       if( byId.isPresent() ) {
           return byId.get();
       }


     return byId.orElse(null);
    }

}
