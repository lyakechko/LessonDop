package package_home_tast;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Reflection<T> {

    public void printInfoMan( T man) {

        Class clazz = man.getClass();
        int modifiers = clazz.getModifiers();
        Modifier.isPublic(modifiers);
        Modifier.isAbstract(modifiers);
        Modifier.isFinal(modifiers);

        Class superClass = clazz.getSuperclass();

        Class[] interfaces = clazz.getInterfaces();
        for (Class classInterface : interfaces) {
            System.out.println(classInterface.getName());
        }

        Field[] publicFields = clazz.getFields();
        for (Field field : publicFields) {
            Class fieldType = field.getType();
            System.out.println(field.getName());
            System.out.println(fieldType.getName());
        }

        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            Class[] paramTypes = constructor.getParameterTypes();
            for (Class paramType : paramTypes) {
                System.out.println(paramType.getName());
            }
        }

        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            System.out.println(method.getReturnType().getName());

            Class[] paramTypes = method.getParameterTypes();
            for (Class paramType : paramTypes) {
                System.out.println(paramType.getName());
            }
        }


    }
}
