import java.util.Iterator;

public class CharIterator implements Iterator {

    private FileContent fileContent;

    public CharIterator(FileContent fileContent) {
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
