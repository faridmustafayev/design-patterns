package behavioral.iterator;

import java.util.Iterator;

public class NamesRepository implements Container{
    private String[] names = {"Farid", "Elsen", "Namiq"};

    public String[] getNames() {
        return names;
    }

    @Override
    public Iterator<String> getIterator() {
        return new CollectionOfNamesIterator(this);
    }

    public static class CollectionOfNamesIterator implements Iterator<String> {
        private int currentElement = 0;
        private NamesRepository namesRepository;

        public CollectionOfNamesIterator(NamesRepository namesRepository) {
            this.namesRepository = namesRepository;
        }

        @Override
        public boolean hasNext() {
            if (currentElement < namesRepository.getNames().length) {
                return true;
            }
            return false;
        }

        @Override
        public String next() {
            if (hasNext()) {
                return namesRepository.names[currentElement++];
            }
            return null;
        }
    }


}
