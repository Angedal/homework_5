package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SqrTest {

    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/sqr.csv")

    public void testCalculateNumberInArray(int min, int max) {
        SqrService service = new SqrService();

        System.out.println(service.calcNumber(min, max));
    }
}
