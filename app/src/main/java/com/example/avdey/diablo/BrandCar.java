package com.example.avdey.diablo;

import java.util.ArrayList;
import java.util.List;

public class BrandCar {

    List<String> getBrandCar(String country) {
        List<String> brands = new ArrayList<>();
        if (country.equals("USA")) {
            brands.add("Ford");
            brands.add("Chevrolet");
            brands.add("Mustang");
        }
        if (country.equals("EUROPA")) {
            brands.add("Audi");
            brands.add("Mersedes");
            brands.add("BMW");
        }
        if (country.equals("RUSSIA")) {
            brands.add("UAZ");
            brands.add("GAZ");
            brands.add("LADA");
        }
        return brands;
    }
}
