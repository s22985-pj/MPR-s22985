package pl.pjatk.factory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryApplication {


	public static void main(String[] args) {
		SpringApplication.run(FactoryApplication.class, args);


	Car samochod = new Car("LA7W", 180, 1598, "MkIV", "VW");
		System.out.println(samochod);
}}
