package adapterPattern;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator {
    // This is the adapter. It adapts an Enumeration to an Iterator.
    private Enumeration enuma;

    // The constructor takes an Enumeration and stores it in an instance variable.
    public EnumerationIterator(Enumeration enumaration) {
        this.enuma = enumaration;
    }

    // The hasNext() method just calls the Enumeration's hasMoreElements() method.
    @Override
    public boolean hasNext() {
        return enuma.hasMoreElements();
    }

    // The next() method calls the Enumeration's nextElement() method.
    @Override
    public Object next() {
        return enuma.nextElement();
    }
}
