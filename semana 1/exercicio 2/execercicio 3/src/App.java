import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        int input = 9;
        System.out.println("Tabela de multiplicação por " + input);
        for (int ii = 1; ii <= 10; ii++) {
            int result = ii * input;
            System.out.println(input + " X " + ii + " = " + result);
        }

    }
}
