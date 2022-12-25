package io.cherrytechnologies.fileservice.util;

import com.github.javafaker.Faker;

public class Util {
    public static final Faker FAKER = Faker.instance();

    public static Faker faker() {
        return FAKER;
    }
}
