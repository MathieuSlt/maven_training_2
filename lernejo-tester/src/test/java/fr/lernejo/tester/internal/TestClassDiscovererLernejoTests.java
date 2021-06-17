package fr.lernejo.tester.internal;

import fr.lernejo.tester.api.TestMethod;

public class TestClassDiscovererLernejoTests {

    @TestMethod
    public void test() {
        var set = new TestClassDiscoverer("fr.lernejo.tester");

        assertEquals(set.size,2);
    }
}
