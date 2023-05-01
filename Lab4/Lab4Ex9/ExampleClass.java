import java.lang.reflect.Field;

public class ExampleClass {
    private int intValue;
    private String stringValue;

    public ExampleClass(int intValue, String stringValue) {
        this.intValue = intValue;
        this.stringValue = stringValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getName() + ":\n");

        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                sb.append(field.getName() + " = " + field.get(this) + "\n");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        ExampleClass example = new ExampleClass(42, "testString");
        System.out.println(example.toString());
    }

}
