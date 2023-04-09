import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class Lab3Ex10 {

    public static void main(String[] args) {
        String path = "C:\\Users\\gladi\\IdeaProjects\\Lab3\\src";

        System.out.println("Using lambda:");
        File[] directories1 = getDirectoriesUsingLambda(path);
        System.out.println(Arrays.toString(directories1));

        System.out.println("Using method reference:");
        File[] directories2 = getDirectoriesUsingMethodReference(path);
        System.out.println(Arrays.toString(directories2));

        System.out.println("Using anonymous inner class:");
        File[] directories3 = getDirectoriesUsingAnonymousInnerClass(path);
        System.out.println(Arrays.toString(directories3));
    }

    // Using lambda expression
    public static File[] getDirectoriesUsingLambda(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            return file.listFiles(f -> f.isDirectory());
        }
        return null;
    }

    // Using method reference
    public static File[] getDirectoriesUsingMethodReference(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            return file.listFiles(File::isDirectory);
        }
        return null;
    }

    // Using anonymous inner class
    public static File[] getDirectoriesUsingAnonymousInnerClass(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            return file.listFiles(new FileFilter() {
                @Override
                public boolean accept(File f) {
                    return f.isDirectory();
                }
            });
        }
        return null;
    }
}
