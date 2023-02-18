import java.io.File;

public class getFolder {
    public static void main(String[] args) {
        String directoryPath = "/Users/duhuazhu/Downloads"; //目录路径
        File file = new File(directoryPath);
        File[] names = file.listFiles();
        for(File name:names){
            System.out.println(name);
        }

    }
}
