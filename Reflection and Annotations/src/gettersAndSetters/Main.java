package gettersAndSetters;

import reflection.Reflection;

import java.lang.reflect.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
       Class reflection = Reflection.class;

        Method[] methods = reflection.getDeclaredMethods();
        List<Method> getters = new ArrayList<>();
        List<Method> setters = new ArrayList<>();

        for (Method method : methods) {
            if(method.getName().startsWith("get")){
                getters.add(method);
            }else if (method.getName().startsWith("set")){
                setters.add(method);
            }
        }


        getters
                .stream()
                .sorted(Comparator.comparing(Method::getName))
                .forEach(g -> System.out.printf("%s will return class %s%n",g.getName(),g.getReturnType().getName()));

        setters
                .stream()
                .sorted(Comparator.comparing(Method::getName))
                .forEach(s -> System.out.printf("%s and will set field of class %s%n",s.getName(),s.getParameterTypes()[0].getName()));

       /* setters.stream().sorted(Comparator.comparing(Method::getName)).forEach(s -> {
            if(Arrays.toString(s.getParameterTypes()).contains("class")){
                System.out.printf("%s and will set field of %s%n",s.getName(), Arrays.toString(s.getParameterTypes()));
            }else {
                System.out.printf("%s and will set field of class %s%n",s.getName(), Arrays.toString(s.getParameterTypes()));
            }
        });*/


/*
        Field[] fields = Reflection.class.getDeclaredFields();

        Arrays.stream(fields)
                .filter(f -> !Modifier.isPrivate(f.getModifiers()))
                .sorted((Comparator.comparing(Field::getName)))
                .forEach(f-> System.out.printf("%s must be private!%n",f.getName()));

        getters.stream()
                .filter(g -> !Modifier.isPublic(g.getModifiers()))
                .sorted((Comparator.comparing(Method::getName)))
                .forEach(g -> System.out.printf("%s have to be public!%n",g.getName()));

        setters.stream()
                .filter(s -> !Modifier.isPrivate(s.getModifiers()))
                .sorted((Comparator.comparing(Method::getName)))
                .forEach(s -> System.out.printf("%s have to be private!%n",s.getName()));*/
    }
}
