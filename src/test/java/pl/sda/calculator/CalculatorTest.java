package pl.sda.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculatorTest {

    private final Calculator sut = new Calculator();

    @Test
    @DisplayName("Powinno zwrocic 5 przy dodawaniu 3 do 2")
    void shouldReturnFiveForGivenArgumentsOnAdditionOperation() {
        //given
        int arg1 = 2;
        int arg2 = 3;

        //when
        int actual = sut.add(arg1, arg2);

        //then
        assertEquals(5.0, actual);
    }

    @Test
    void shouldBeDividableByThree() {
        //given
        int arg1 = 9;

        //when
        sut.isDividableByThree(arg1);
        boolean actual = sut.isDividableByThree(arg1);

        //then
        Assertions.assertTrue(actual);
    }

    @Test
    @DisplayName("Powinno zwrócić 14 przy odejmowaniu 7 od 21")
    void shouldReturnFourteenForGiveArgsOnSubstractionOperation() {
        //given
        int arg1 = 21;
        int arg2 = 7;
        //when
        int actual = sut.substract(arg1, arg2);
        //then
        assertEquals(14, actual);

    }

    @Test
    @DisplayName("Powinno zwrócić 10 przy mnozeniu 5 przez 2")
    void shouldReturnTenForGiveArgsOnMultiplyOperation() {
        //given
        int arg1 = 5;
        int arg2 = 2;
        //when
        int actual = sut.multiply(arg1, arg2);
        //then
        assertEquals(10, actual);
    }


    @Test
    @DisplayName("Powinno zwrocic 0 przy mnozeniu razy 0")
    void shouldReturnZeroForMultiplactionTimesZero() {
        //given
        int arg1 = 0;
        int arg2 = 427;

        //when
        int actual = sut.multiply(arg1, arg2);

        //then
        assertEquals(0, actual);
    }

    @Test
    @DisplayName("Powinno zwrocic 5 przy dzieleniu 10 przez 2")
    @Disabled
    void shouldReturnFiveForDivsionTenByTwo() {
        //given
        int arg1 = 10;
        int arg2 = 2;

        //when
        int actual = sut.division(arg1, arg2);

        //then
        assertEquals(5, actual);
    }

    @Test
    @DisplayName("Powinno zwrocic 10 przy dzieleniu czegokolwiek przez 0")
    @Disabled
    void shouldReturnZeroForDivisionByZero() {
        //given
        int argThatsValueIsNotImportant = 10;
        int arg2 = 0;

        //when
        int actual = sut.division(argThatsValueIsNotImportant, arg2);

        //then
        assertEquals(0, actual);

    }

    @Test
    @DisplayName("Powinno zwrocic 0 przy dzieleniu przez cokolwiek")
    @Disabled
    void shouldReturnZeroForZeroDividedByAnyhting() {
        //given
        int arg1 = 0;
        int argThatsValueIsNotImportant = 100;

        //when
        int actual = sut.division(arg1, argThatsValueIsNotImportant);

        //then
        assertEquals(0, actual);
    }


    @Test
    @DisplayName("Czy liczba 8 jest parzysta")
    void ifNumberisEven() {

        //given
        int arg = 6;

        //when
        boolean actual = sut.ifNumberIsEven(arg);

        //then
        assertTrue(actual);

    }

    @Test
    @DisplayName("Czy liczba jest nieparzysta")
    void ifNumberisNotEven() {

        //given
        int arg = 7;

        //when
        boolean actual = sut.ifNumberIsNotEven(arg);

        //then
        assertTrue(actual);
        }

        @Test
        @DisplayName("Powinno zwrocic 0.5 przy liczeniu 10% z 5")
        void shouldReturnProperPercentageForIntigerNumber() {
        //given
            double arg1 = 5;
            double arg2 = 10;

         //when
            double actual = sut.percentage(arg1, arg2);

         //then
         assertEquals(200.0d, actual, 0.0000001d);
        }
    }

