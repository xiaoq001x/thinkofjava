package main.Enum;

import main.net.util.OSExecute;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Bashark on 2016/11/28.
 */
public class Reflection {
    static Set<String> analyze(Class<?> enumClass) {
        System.out.println("interface:");
        for (Type t : enumClass.getGenericInterfaces()) {
            System.out.println(t);
        }
        System.out.println("Base class : " + enumClass.getSuperclass());
        System.out.println("Methods:");
        Set<String> methods = new TreeSet<String>();
        for (Method m : enumClass.getMethods()) {
            methods.add(m.getName());
        }
        System.out.println(methods);
        return methods;
    }

    public static void main(String[] args) {
        Set<String> exploreMethods = analyze(Explore.class);
        Set<String> enumMenthods = analyze(Enum.class);
        System.out.println("Explore methods " + exploreMethods.containsAll(enumMenthods));
        System.out.println("remove all enum");
        exploreMethods.removeAll(enumMenthods);
        System.out.println(exploreMethods);
        OSExecute.command("javap Explore");
    }
}
