package io.cnuf.first;

import java.util.Optional;

public class Person {
    public Optional<Car> car = Optional.empty();
    public Optional<Car> getCar() { return car; }
    public void setCar(Optional<Car> car) {
        this.car = car;
    }
}