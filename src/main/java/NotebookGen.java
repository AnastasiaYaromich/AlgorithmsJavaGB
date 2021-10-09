import java.util.Arrays;

public class NotebookGen {
    public static void main(String[] args) {
        Notebook[] nb = Notebook.getArrNb(10000, 50, 4);
    //    System.out.println("Начальный массив: \n" + Arrays.toString(nb));
        NotebookSort.startTime();
        NotebookSort.bubbleSort(nb);
        NotebookSort.startTime();
        NotebookSort.bubbleSort(nb);
        System.out.print("Bubble sort выполнена за, мс: ");
        NotebookSort.endTime();
        System.out.println("Отсортированный массив(bubbleSort): \n" + Arrays.toString(nb));
    }
}
