public class App {
    public static void main(String[] args) throws Exception {
        float input = -15;
        String output = Float.toString(input);
        if (input % 2 != 0) {
            output = output + " é impar";
        } else {
            output = output + " é par";
        }
        if (input >= 0) {
            output = output + " e positivo";
        } else {
            output = output + " e negativo ";
        }

        System.out.println(output);
    }
}
