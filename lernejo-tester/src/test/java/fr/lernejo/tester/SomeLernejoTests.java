package fr.lernejo.tester;

import fr.lernejo.tester.api.TestMethod;

public class SomeLernejoTests {

    @TestMethod
    public void ok() {

    }

    @TestMethod
    public void ko() {
        throw new IllegalAccessException("ko");
    }

    public void none() {

    }
}
