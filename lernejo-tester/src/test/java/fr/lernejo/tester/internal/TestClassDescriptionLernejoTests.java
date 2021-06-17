package fr.lernejo.tester.internal;

import fr.lernejo.tester.SomeLernejoTests;
import fr.lernejo.tester.api.TestMethod;

import java.io.IOException;

public class TestClassDescriptionLernejoTests {

    public static void assertEquals(int expect, int got) {
        if (expect != got)
            throw new RuntimeException("Assertion failed, expected " + expect + ", got " + got + "!");
    }

    @TestMethod
    public void test() {
        try {
            var list = new TestClassDescription(SomeLernejoTests.class).listTestMethods();
            assertEquals(2, list.size());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
