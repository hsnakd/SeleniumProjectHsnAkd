package com.cydeo.selenium;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class P09_Faker_Practice {

    @Test
    public void fakerTest(){
        Faker faker = new Faker();
        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        System.out.println("faker.address().streetAddress() = " + faker.address().streetAddress());
        System.out.println("faker.address().cityName() = " + faker.address().cityName());
        System.out.println("faker.address().state() = " + faker.address().state());
        System.out.println("faker.address().zipCode() = " + faker.address().zipCode());

        System.out.println("faker.number().numberBetween(10000,90000) = " + faker.number().numberBetween(10000, 90000));
        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("546-###-####"));
        System.out.println("faker.letterify(\"?????\") = " + faker.letterify("?????"));

        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());





        System.out.println("faker.ancient().hero() = " + faker.ancient().hero());
        System.out.println("faker.animal().name() = " + faker.animal().name());
        System.out.println("faker.app().name() = " + faker.app().name());
        System.out.println("faker.app().version() = " + faker.app().version());
        System.out.println("faker.aviation().aircraft() = " + faker.aviation().aircraft());
        System.out.println("faker.aviation().METAR() = " + faker.aviation().METAR());
        System.out.println("faker.aviation().airport() = " + faker.aviation().airport());
        System.out.println("faker.artist().name() = " + faker.artist().name());
        System.out.println("faker.avatar().image() = " + faker.avatar().image());
        System.out.println("faker.business().creditCardNumber() = " + faker.business().creditCardNumber());
        System.out.println("faker.weather().temperatureCelsius(10, 40) = " + faker.weather().temperatureCelsius(10, 40));
        System.out.println("faker.university().name() = " + faker.university().name());
        System.out.println("faker.relationships().inLaw() = " + faker.relationships().inLaw());
        System.out.println("faker.nation() = " + faker.nation());
        System.out.println("faker.nation().capitalCity() = " + faker.nation().capitalCity());
        System.out.println("faker.nation().flag() = " + faker.nation().flag());
        System.out.println("faker.nation().language() = " + faker.nation().language());
        System.out.println("faker.nation().nationality() = " + faker.nation().nationality());
        System.out.println("faker.howIMetYourMother().character() = " + faker.howIMetYourMother().character());
        System.out.println("faker.gameOfThrones().character() = " + faker.gameOfThrones().character());
        System.out.println("faker.idNumber() = " + faker.idNumber());




    }

}
