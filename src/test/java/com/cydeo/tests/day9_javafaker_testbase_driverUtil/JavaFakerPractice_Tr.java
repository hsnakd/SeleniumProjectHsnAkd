package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import java.util.Locale;

public class JavaFakerPractice_Tr {

    @Test
    public void test1(){
        //Creating Faker object to reach methods
        //Faker faker = new Faker();
        Faker faker = new Faker(new Locale("tr"));

        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());

        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        //numerify() method will generate random numbers in the format we want to get
        System.out.println("faker.numerify(\"###-###-####\") = "
                + faker.numerify("###-###-####"));

        System.out.println("faker.numerify(\"312-###-####\") = "
                + faker.numerify("312-###-####"));

        //letterify() method will return random letters where we pass "?"
        System.out.println("faker.letterify(\"???-????\") = "
                + faker.letterify("???-????"));

        System.out.println("faker.bothify(\"##?#-##?#-#?#?#-##??\") = "
                + faker.bothify("##?#-##?#-#?#?#-##??"));

        System.out.println("faker.finance().creditCard() = "
                + faker.finance().creditCard().replaceAll("-", ""));

        System.out.println("faker.chuckNorris().fact() = "
                + faker.chuckNorris().fact().replaceAll("Chuck Norris", "Muhtar"));


        System.out.println("faker.nation().capitalCity() = " + faker.nation().capitalCity());
        System.out.println("faker.nation().language() = " + faker.nation().language());
        System.out.println("faker.nation().flag() = " + faker.nation().flag());
        System.out.println("faker.nation().nationality() = " + faker.nation().nationality());

        System.out.println("faker.address().streetAddress() = " + faker.address().streetAddress());
        System.out.println("faker.address().cityName() = " + faker.address().cityName());
        System.out.println("faker.address().state() = " + faker.address().state());
        System.out.println("faker.address().zipCode() = " + faker.address().zipCode());
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
        System.out.println("faker.howIMetYourMother().character() = " + faker.howIMetYourMother().character());
        System.out.println("faker.gameOfThrones().character() = " + faker.gameOfThrones().character());
        System.out.println("faker.idNumber() = " + faker.idNumber().valid());


    }
}
