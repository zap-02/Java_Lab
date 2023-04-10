import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class Lab3Ex12 {
    public static void main(String[] args){
        String folderName ="C:\\Users\\maksi\\IdeaProjects\\Java_Lab\\Files\\";
        File folder = new File(folderName);
        File[] files = folder.listFiles();
        assert files != null;
        Arrays.sort(files, Comparator.comparing(File::isDirectory).reversed().thenComparing(f -> f.getPath()));
        for(File file : files){
            System.out.println(file);
        }
    }
}
