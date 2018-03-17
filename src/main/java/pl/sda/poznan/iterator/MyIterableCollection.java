package pl.sda.poznan.iterator;

import java.lang.Iterable;
import java.util.Iterator;


public class MyIterableCollection implements Iterable<String> {
    private int index = 0;
    private int indexIt = 0;
    private String[] elements = new String[10];

    public void add(String e) {
        if (indexIt < elements.length) {
            elements[indexIt++] = e;
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            @Override
            public boolean hasNext() {
                if (index >= elements.length) {
                    return false;
                }
                String elem = elements[index];
                return elem != null;
            }

            @Override
            public String next() {
                if (!hasNext()) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                return elements[index++];
            }
        };
    }

}
