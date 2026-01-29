import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateFinder {
    Map<String, List<FileInfo>> mfs = new HashMap<>();

    public Map<String, List<FileInfo>> finderDuplicate(List<FileInfo> lfi){
        for (int i = 0; i < lfi.size(); i++) {
            if (mfs.containsKey(lfi.get(i).getName())){
                mfs.get(lfi.get(i).getName()).add(lfi.get(i));
            }else{
                List<FileInfo> list = new ArrayList<>();
                list.add(lfi.get(i));
                mfs.put(lfi.get(i).getName(),list);
            }
        }
        return mfs;
    }
}
