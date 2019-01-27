import java.util.Arrays;

public class Board {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Kuba";
        names[1] = "Michał";
        names[2] = "Kasia";

        String arrayString = Arrays.toString(names);
        System.out.println(arrayString);
    }
}
