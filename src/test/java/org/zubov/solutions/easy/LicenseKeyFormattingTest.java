package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class LicenseKeyFormattingTest {

    @ParameterizedTest
    @CsvSource(value = {
            "5F3Z-2e-9-w, 4, 5F3Z-2E9W",
            "2-5g-3-J, 2, 2-5G-3J",
    })
    void testCases(String line, int k, String expected) {
        //Given

        //When
        String result = LicenseKeyFormatting.licenseKeyFormatting(line, k);

        //Then
        assertEquals(expected, result);
    }
}