import java.lang.reflect.*;

public class ReflectionDemo {
    public void hello() {
        System.out.println("Hello via Reflection");
    }

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("ReflectionDemo");
        Method[] methods = clazz.getDeclaredMethods();

        System.out.println("Methods:");
        for (Method m : methods) {
            System.out.println(m.getName());
        }

        Object instance = clazz.getDeclaredConstructor().newInstance();
        Method method = clazz.getDeclaredMethod("hello");
        method.invoke(instance);
    }
}
