package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    CarRepository repository;

    @Override
    public void run(String... strings) throws Exception {
        Car car = new Car("2018", "BMW",
                "3-Series" );
        repository.save(car);

        car = new Car("2018", "FORD",
                "F-150" );
        repository.save(car);

        car = new Car("1997", "FORD",
                "F-150");
        repository.save(car);
    }
}
