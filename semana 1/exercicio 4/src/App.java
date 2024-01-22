import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        String[] array1 = { "Morango", "Banana", "Maçã", "Uva", "Caqui" };
        String[] array2 = { "Manga", "Caqui", "Morango", "Amora" };
        HashMap<String, String> Hashlist = new HashMap<>();
        if (array1.length > array2.length) {
            for (int ii = 0; ii < array1.length; ii++) {
                Hashlist.put(array1[ii], array1[ii]);
            }
            for (int ii = 0; ii < array2.length; ii++) {
                if (Hashlist.get(array2[ii]) != null) {
                    System.out.println(array2[ii]);
                }
            }

        } else {
            for (int ii = 0; ii < array2.length; ii++) {
                Hashlist.put(array2[ii], array2[ii]);
            }
            for (int ii = 0; ii < array1.length; ii++) {
                if (Hashlist.get(array1[ii]) != null) {
                    System.out.println(array1[ii]);
                }
            }
        }

    }
}
