package behavioral.iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        NamesRepository namesRepository = new NamesRepository();
        Iterator<String> getNamesCollection = namesRepository.getIterator();

        while (getNamesCollection.hasNext()) {
            System.out.println("Hi! " + getNamesCollection.next());
        }


        System.out.println("----------------------");

        String[] names = namesRepository.getNames();

        for (String name :
                names) {
            System.out.println("Hi! " + name);
        }

    }
}
