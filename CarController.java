package pl.pjatk.factory;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;  // zależność

    public CarController(CarService carService) {
        this.carService = carService;
    } // wstrzykiwanie zależności





    @GetMapping
    public ResponseEntity<Car> printHelloWorld() {

        return ResponseEntity.ok(carService.buildCar("Toyota", "Corolla"));
    }

    @GetMapping("/build")
    public ResponseEntity<Car> getCar() {
        return ResponseEntity.ok(carService.buildCar("Subaru","Forester"));
    }
    // h2 database spring boot
}
