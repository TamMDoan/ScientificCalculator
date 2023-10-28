package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Console;
import org.junit.Test;

import java.util.Optional;

import static com.zipcodewilmington.scientificcalculator.Console.addNumbers;
import static org.junit.Assert.assertEquals;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

    @Test
    public void testAddNumbers() {
        Double number1 = 1.0;
        Double number2 = 2.0;

        Double expected = 3.0;

        assertEquals(expected, addNumbers(number1, number2));
    }

}
