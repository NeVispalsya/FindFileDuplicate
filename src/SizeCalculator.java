import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SizeCalculator {
    Map<Long, List<FileInfo>> mfs = new HashMap<>();

    public Map<Long,List<FileInfo>> sortMapFile(Map<String,List<FileInfo>> msli){
        for (Map.Entry<String, List<FileInfo>> entry : msli.entrySet()) {
            String key = entry.getKey();
            List<FileInfo> group = entry.getValue();
            for (int i = 0; i < group.size(); i++) {
                if (mfs.containsKey(group.get(i).getSize())){
                    mfs.get(group.get(i).getSize()).add(group.get(i));
                }else{
                    List<FileInfo> list = new ArrayList<>();
                    list.add(group.get(i));
                    mfs.put(group.get(i).getSize(),list);
                }
            }
        }
        return mfs;
    }
}
