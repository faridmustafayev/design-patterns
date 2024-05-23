package behavioral.strategy.sortStrategy;

public class MergeSortStrategy implements SortStrategy{
    @Override
    public void sort(int[] array) {
        System.out.println("Merge sort strategy");
    }
}
