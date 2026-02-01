import java.io.File;

public class Main {
    public static void main(String[] args) {
        String path = "/Desktop/JavaPRO2026/FindFileDuplicate/src/Files";
        FileScanner fs = new FileScanner();
        File rootDit = new File(path);
        DuplicateFinder duplicateFinder = new DuplicateFinder();
        SizeCalculator sizeCalculator = new SizeCalculator();
        System.out.println(duplicateFinder.finderDuplicate(fs.scanFile(rootDit)));
        System.out.println(sizeCalculator.sortMapFile(duplicateFinder.finderDuplicate(fs.scanFile(rootDit))));
    }
}