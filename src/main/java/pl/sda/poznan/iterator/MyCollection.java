package pl.sda.poznan.iterator;

public class MyCollection implements Iterable<String> {
    private int index;
    private String[] elements = new String[10];

    public void addElement(String e) {
        if (index < elements.length) {
            elements[index++] = e;
        }
    }


    @Override
    public Iterator<String> getIterator() {
        return new Iterator<String>() {
            private int iteratorIndex = 0;

            @Override
            public String getNextElement() {
                if (!hasNextElement()) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                return elements[iteratorIndex++];
            }

            @Override
            public boolean hasNextElement() {
                if (iteratorIndex >= elements.length) {
                    return false;
                }
                String elem = elements[iteratorIndex];
                return elem != null;
            }
        };
    }

    /*private class MyCollectionIterator implements Iterator<String> {
        private int iteratorIndex = 0;

        @Override
        public String getNextElement() {
            if (!hasNextElement()) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return elements[iteratorIndex++];
        }

        @Override
        public boolean hasNextElement() {
            if (iteratorIndex >= elements.length) {
                return false;
            }
            String elem = elements[iteratorIndex];
            return elem != null;
        }
    }*/
}
