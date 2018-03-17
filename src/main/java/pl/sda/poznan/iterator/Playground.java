package pl.sda.poznan.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Playground {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Piotr", "Jan", "Ala");

        System.out.println("Petla for each .............");
        for (String s : names) {
            System.out.println(s);
        }

        System.out.println("Petla z uzyciem iteratora..................");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println("Pobrana wartosc to: " + next);
        }

        for (int i = 0; i < names.size(); i++) {
            String s = names.get(i);
            System.out.println(s);
        }

        System.out.println("z użyciem własnego ietratora............");
        MyCollection imiona = new MyCollection();
        imiona.addElement("Piotr");
        imiona.addElement("Sławek");
        imiona.addElement("Weronika");
        pl.sda.poznan.iterator.Iterator<String> imionaIterator = imiona.getIterator();
        while (imionaIterator.hasNextElement()) {
            String elem = imionaIterator.getNextElement();
            System.out.println(elem);
        }

        MyIterableCollection collection = new MyIterableCollection();
        collection.add("Mirek");
        collection.add("Jasiu");
        collection.add("Ada");

        for (String s : collection)
            System.out.println(s);
    }
}
