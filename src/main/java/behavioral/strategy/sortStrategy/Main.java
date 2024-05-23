package behavioral.strategy.sortStrategy;

public class Main {
    public static void main(String[] args) {

        var mergeSortStrategy = new MergeSortStrategy();
        var sortingContextMerge = new SortingContext(mergeSortStrategy);
        sortingContextMerge.performSort(new int[]{2, 3, 5, 1});

    }
}
