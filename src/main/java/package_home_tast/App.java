package package_home_tast;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //Задание 1
        Man man = new Man();
        Reflection<Man> reflection = new Reflection<>();
        reflection.printInfoMan(man);

        //Задание 2
        HelloWorld helloWorld = new HelloWorld();
        Class clazzz = helloWorld.getClass();
        Class[] paramTypes = new Class[]{};
        Method method = clazzz.getDeclaredMethod("printHelloWorld", paramTypes);
        method.invoke(helloWorld);

        //Задание 3
        Method[] methods = clazzz.getMethods();
        for (Method methodTest : methods) {
            if (methodTest.isAnnotationPresent(AcademyInfo.class)) {
                System.out.println(methodTest.getName());

            }
        }
    }
}