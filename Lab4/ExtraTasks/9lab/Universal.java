import java.lang.reflect.Field;
import java.lang.reflect.InaccessibleObjectException;

public class Universal {

    public static String toString(Object object) {

        if (object == null)
            return null;

        Class<?> classObject = object.getClass();
        Field[] fields = classObject.getDeclaredFields();

        StringBuilder result = new StringBuilder("[");
        result.append(classObject.getSimpleName());
        result.append(": ");

        for (Field field : fields) {
            result.append(field.getName());
            Object fieldObject;

            try {
                field.setAccessible(true);
                fieldObject = field.get(object);

                result.append(" = ");
                if (field.getType().isPrimitive()) {
                    result.append(fieldObject);
                } else {
                    result.append(toString(fieldObject));
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InaccessibleObjectException ignored) {
            } finally {
                result.append("\t");

            }
        }

        result.append("]");
        return result.toString();
    }


}