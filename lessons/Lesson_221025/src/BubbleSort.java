import java.util.List;

public class BubbleSort implements Sorter {
    @Override
    public void sort(List<Integer> data) {
        System.out.print("Bubble sort in process... ");
        for(int i = 0; i < data.size() - 1; ++i) {
            for(int j = 0; j < i; ++j) {
                if(data.get(j) > data.get(j + 1)) {
                    Integer tmp = data.get(j);
                    data.set(j, data.get(j + 1));
                    data.set(j + 1, tmp);
                }
            }
        }
        System.out.println("OK");
    }
}
