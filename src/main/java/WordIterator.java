import java.util.Iterator;

public class WordIterator implements Iterator {

    private FileContent fileContent;

    public WordIterator(FileContent fileContent) {
        this.fileContent = fileContent;
    }

    public boolean hasNext() {
        return false;
    }

    public Object next() {
        return null;
    }

    public void remove() {}
}
