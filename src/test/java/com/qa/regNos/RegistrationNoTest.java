package com.qa.regNos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegistrationNoTest {

    @Test
    public void test_returns_september_identifier_from_march_being_passed(){
        //arrange
        int marchNumber = 02;
        int septemberNumber = 52;

        RegistrationNo cut = new RegistrationNo();

        //act
        int resultNumber = cut.returnsSeptemberIdentifierFromMarchBeingPassed(marchNumber);

        //assert
        assertEquals(septemberNumber, resultNumber);
    }
}
