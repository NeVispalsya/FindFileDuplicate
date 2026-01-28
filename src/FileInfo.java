public class FileInfo {
    String name;
    String path;
    long size;
    long crc32;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public long getCrc32() {
        return crc32;
    }

    public void setCrc32(long crc32) {
        this.crc32 = crc32;
    }

    public FileInfo(String name, String path, long size, long crc32) {
        this.name = name;
        this.path = path;
        this.size = size;
        this.crc32 = crc32;
    }

    @Override
    public String toString() {
        return "FileInfo{" +
                "name='" + name + '\'' +
                '}';
    }
}
