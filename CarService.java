package pl.pjatk.factory;

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
