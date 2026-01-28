import java.io.File;

public class Main {
    public static void main(String[] args) {
        String path = "/Users/stakovskiy/Desktop/JavaPRO2026/FindFileDuplicate/src/Files";
        FileScanner fs = new FileScanner();
        File rootDit = new File(path);
        System.out.println(fs.scanFile(rootDit));
    }
}