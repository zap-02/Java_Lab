import java.lang.reflect.Field;

public class ReflectionExample {
    private String name = "Reflection";

    // метод, вызывающий getName() напрямую
    public String getNameDirectly() {
        return this.name;
    }

    // метод, вызывающий getName() через рефлексию
    public String getNameViaReflection() {
        try {
            Field field = this.getClass().getDeclaredField("name");
            field.setAccessible(true);
            return (String) field.get(this);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        ReflectionExample example = new ReflectionExample();

        // замеряем время выполнения вызова метода getNameDirectly()
        long startDirect = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            example.getNameDirectly();
        }
        long endDirect = System.currentTimeMillis();
        System.out.println("Time taken with direct call: " + (endDirect - startDirect) + "ms");

        // замеряем время выполнения вызова метода getNameViaReflection()
        long startReflection = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            example.getNameViaReflection();
        }
        long endReflection = System.currentTimeMillis();
        System.out.println("Time taken with reflection: " + (endReflection - startReflection) + "ms");
    }
}
