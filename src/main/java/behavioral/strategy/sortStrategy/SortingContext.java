package behavioral.strategy.sortStrategy;

public class SortingContext {
    private SortStrategy sortStrategy;

    public SortingContext(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void performSort(int[] arr) {
        sortStrategy.sort(arr);
    }

}
