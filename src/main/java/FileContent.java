import java.util.Iterator;

public class FileContent implements IterableText {

    private String filename;

    public FileContent(String filename) {
        this.filename = filename;
    }

    public Iterator<String> charIterator() {
        return null;
    }

    public Iterator<String> wordIterator() {
        return null;
    }

    public String getFilename() {
        return filename;
    }
}
