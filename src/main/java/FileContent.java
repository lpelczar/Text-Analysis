import java.util.Iterator;

public class FileContent implements IterableText {

    private String content;

    public FileContent(String content) {
        this.content = content;
    }

    public Iterator<String> charIterator() {
        return null;
    }

    public Iterator<String> wordIterator() {
        return null;
    }

    public String getFilename() {
        return null;
    }
}
