import java.util.List;

public class SelectionSort implements Sorter {

    @Override
    public void sort(List<Integer> data) {
        System.out.print("Selection sort in process... ");
        for(int i = 0; i < data.size() - 1; ++i) {
            int maxIndex = 0;
            for(int j = 0; j < data.size() - i; ++j) {
                if(data.get(j) > data.get(maxIndex)) {
                    maxIndex = j;
                }
            }
            Integer tmp = data.get(data.size() - i - 1);
            data.set(data.size() - i - 1, data.get(maxIndex));
            data.set(maxIndex, tmp);
        }
        System.out.println("OK");
    }
}
