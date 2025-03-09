package tn.esprit.spring.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class UserServiceImplTest {

    @Test
    void testAddUser() {
        String envVar = System.getenv("TIMESHEET_TESTS_FAIL");
        if ("True".equalsIgnoreCase(envVar)) {
            fail("Le test échoue car TIMESHEET_TESTS_FAIL est activé !");
        }

    }
    @Test
     void testUpdateUser() {
        String envVar = System.getenv("TIMESHEET_TESTS_FAIL");
        if ("True".equalsIgnoreCase(envVar)) {
            fail("Le test échoue car TIMESHEET_TESTS_FAIL est activé !");
        }

    }
     @Test
     void testDeleteUser() {
        String envVar = System.getenv("TIMESHEET_TESTS_FAIL");
        if ("True".equalsIgnoreCase(envVar)) {
            fail("Le test échoue car TIMESHEET_TESTS_FAIL est activé !");
        }

    }
     @Test
      void testRetrieveUser() {
        String envVar = System.getenv("TIMESHEET_TESTS_FAIL");
        if ("True".equalsIgnoreCase(envVar)) {
            fail("Le test échoue car TIMESHEET_TESTS_FAIL est activé !");
        }

    }

}