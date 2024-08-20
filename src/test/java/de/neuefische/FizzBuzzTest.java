package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void play_shouldReturn1_whenCalledWith1(){
        //GIVEN
        int number = 1;
        String expected = "1";
        //WHEN
        String actual = FizzBuzz.play(number);
        //THEN
        assertEquals(expected, actual);
    }

}