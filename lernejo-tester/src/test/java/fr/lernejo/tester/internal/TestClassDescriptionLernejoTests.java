package fr.lernejo.tester.internal;

import fr.lernejo.tester.SomeLernejoTests;
import fr.lernejo.tester.api.TestMethod;

import java.lang.reflect.Method;
import java.util.List;

public class TestClassDescriptionLernejoTests {

    public static boolean assertEquals(int got, int expected) {
        return (got == expected);
    }

    @TestMethod
    public static void test() {
        List<Method> liste = new TestClassDescription(SomeLernejoTests.class).listTestMethods();

        boolean test = assertEquals(liste.size(), 2);
        System.out.println(test);
        if (test == false){
            throw new IllegalStateException("Size of the list is false");
        }
    }

    public static void main(String[] args) {
        test();
    }
}
