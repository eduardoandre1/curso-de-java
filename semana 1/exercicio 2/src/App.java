import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        int input = 20;
        List<Integer> fibonacciList = new ArrayList<>();
        int realSize = input;
        for (int ii = 0; ii < realSize; ii++) {
            if (ii <= 1) {
                fibonacciList.add(ii);
            } else {
                fibonacciList.add(fibonacciList.get(fibonacciList.size() - 1) + fibonacciList.get(fibonacciList.size() - 2));
            }
            System.out.print(fibonacciList.get(ii) + " ");
        }
    }
}
