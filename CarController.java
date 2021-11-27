package pl.pjatk.factory;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<Car> getCar(@RequestParam String make, @RequestParam String model) {
        return ResponseEntity.ok(carService.buildCar(make,model));
    }
    // h2 database spring boot
    // @RequestParam cars/build/make=Ford&model=Focus
    // /cars/find/3

    @GetMapping("/find/{id}")
    public ResponseEntity<Car> findCar(@PathVariable Long id) {
        return ResponseEntity.ok(carService.FindbyId(id));
    }
    //Poczytać o OPTIONAL
    //Poczytać o @PathVariable
    // @RequestParam
    //Przecwiczyć rozne zapytania z carRepository
    //
    // h2 database spring boot
}
