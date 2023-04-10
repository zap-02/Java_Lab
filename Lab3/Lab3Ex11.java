import java.io.File;
import java.util.Arrays;

public class Lab3Ex11 {
    public static void main(String[] args) {
        String path = "C:\\Users\\admin\\IdeaProjects\\FolderWithFile";
        String extension = "txt";

        File[] files = getFilesByExtension(path, extension);
        System.out.println(Arrays.toString(files));
    }

    public static File[] getFilesByExtension(String path, String extension) {
        File dir = new File(path);
        return dir.listFiles((dir1, name) -> name.endsWith("." + extension));
    }
}

