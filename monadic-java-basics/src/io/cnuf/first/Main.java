package io.cnuf.first;

import java.util.Optional;

/**
 * Note: As Car::getInsurance was null, the program returned NPE.
 * While working functional, don't use null. At leat use units like Optional.empty()
 */
public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        Car _c = new Car();
        _c.setInsurance(Optional.of(new Insurance()));

        Optional<Car> car = Optional.of(_c);
        person.setCar(car);

        System.out.println(
                Optional.of(person)
                        .flatMap( p -> p.getCar())
                        .flatMap(c-> c.getInsurance())
                        .map(i -> i.getName())
                        .orElse("NONE"));
        ;
    }
}
