import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileScanner {
    List<FileInfo> fl = new ArrayList<>();

    public List<FileInfo> scanFile(File file){
        if(file.isFile()){
           FileInfo fi = new FileInfo(file.getName().toString(),file.getPath(),file.length(),0);
           fl.add(fi);
           return fl;
        }else{
            if(file.isDirectory()){
                    File[] filesInFolder = file.listFiles();
                    if (filesInFolder != null) {
                        for (File current : filesInFolder) {
                            scanFile(current);
                        }
                    }
            }
        }
      return fl;
    }
}
