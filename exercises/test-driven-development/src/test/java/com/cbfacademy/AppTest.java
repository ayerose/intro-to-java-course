package com.cbfacademy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Year;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName(value = "Basic Test Suite")
public class AppTest {

    @Test
    @DisplayName("creates the app")
    public void createsAnApp() {
        final App app = new App();

        assertThat(app, is(notNullValue()));
    }

   /*  @Test
    @DisplayName("1700 is not a leap year")
    public void seventeenHunIsNotALeapYear() {
        assertEquals(false, Year.isLeap(1700));
    }

    @Test
    @DisplayName("2000 is a leap year")
    public void twoThousandIsALeapYear(){
        assertEquals(true, Year.isLeap(2000));
    }

    @Test
    @DisplayName("2030 is not a leap year")
    public void twoThirtyiSNOTaLeapYear(){
        assertEquals(false, Year.isLeap(2030));
} */
 
    static Stream <Arguments> inputAndOutputProvider(){
        return Stream.of(
            Arguments.of(1600, true),
            Arguments.of(1700, false), 
            Arguments.of(2000, true),
            Arguments.of(2030, false)
        );
    }
    @ParameterizedTest
    @MethodSource("inputAndOutputProvider")
    @DisplayName("Determine whether leap year or not")
    public void returnExpectedMethod(int year, boolean expected) {
        assertEquals(expected, Year.isLeap(year));
    }
    } 