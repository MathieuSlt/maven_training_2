package fr.lernejo.tester.internal;


import java.util.List;
import java.util.Set;

public class TestClassDiscoverer {

    private final String name;

    public TestClassDiscoverer(String name) {
        this.name = name;
    }

    /*public List<TestClassDescription> listTestClasses() {
        Reflections = new Reflections(name, new SubTypeScanner(false));
        Set<Class<?>> allTypes = reflections.getSubTypesOf(Object.class);

        return allTypes.stream()
            .filter(s -> s.getName().endsWith("LernejoTests"))
            .map(TestClassDescription::new)
            .filter(s -> !s.listTestMethods().isEmpty())
            .toList();
    }*/

}
