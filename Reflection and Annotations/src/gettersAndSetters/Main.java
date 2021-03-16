package gettersAndSetters;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static class MethodComparatorByName implements Comparator<Method> {

        @Override
        public int compare(Method f, Method s) {
            return f.getName().compareTo(s.getName());
        }
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {

        Class<?> clazz = Class.forName("Reflection");

        Method[] declaredMethods = clazz.getDeclaredMethods();

        Set<Method> getter = new TreeSet<>(new MethodComparatorByName());

        Set<Method> setter = new TreeSet<>(new MethodComparatorByName());

        for (Method method : declaredMethods) {
            if (method.getName().startsWith("get")
                    && method.getParameterCount() == 0
                    && method.getReturnType() != void.class) {

                getter.add(method);
            } else if (method.getName().startsWith("set")
                    && method.getParameterCount() == 1
                    && method.getReturnType() == void.class) {

                setter.add(method);
            }
        }
        System.out.println(getter
                .stream()
                .map(g -> String.format("%s will return class %s", g.getName(), g.getReturnType().getName().replace("class","")))
                .collect(Collectors.joining(System.lineSeparator()))
        );

        System.out.println(setter
                .stream()
                .map(s -> String.format("%s will set field of class %s", s.getName(), s.getParameterTypes()[0]
                .getName().replace("class","")))
                .collect(Collectors.joining(System.lineSeparator()))
        );
    }
}
