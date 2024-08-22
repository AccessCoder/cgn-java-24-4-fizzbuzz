package de.neuefische;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {


    @ParameterizedTest
    @CsvSource(
            value = {
                    "1,1",
                    "4,4",
                    "3,Fizz",
                    "6,Fizz",
                    "5,Buzz",
                    "10,Buzz",
                    "15,FizzBuzz",
                    "0,FizzBuzz",
                    "-1,-1",
                    "-15,FizzBuzz"
            }
    )
    void testPlay(int number, String expected){
        //WHEN
        String actual = FizzBuzz.play(number);
        //THEN
        assertEquals(expected, actual);
    }

}