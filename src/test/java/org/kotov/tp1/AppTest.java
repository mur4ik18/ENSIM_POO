package org.kotov.tp1;

import org.junit.Test;

import static org.junit.Assert.assertNull;

public class AppTest {

    @Test
    public void Test() {
        Zoo zoo = new Zoo();
        zoo.ajouterSecteur(TypeAnimal.CHAT);
        Exception exc = null;
        try {
            zoo.nouveauVisiteur();
            zoo.nouveauVisiteur();
        } catch (Exception e) {
            exc = e;
        }
        assertNull(exc);

        System.out.println("Test 1 " + exc);

    }
}
