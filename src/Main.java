import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("ВВедите количество элементов массива:  ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        System.out.print("ВВедите диапозон значений элементов например (1,5):  ");
        String range = sc.next();

        String[] ranges = range.split(",");
        System.out.println(Arrays.toString(ranges));
        int low = Integer.parseInt(ranges[0]);
        int high = Integer.parseInt(ranges[1]);

        Algorythm algorythm = new Algorythm(count, low, high);
        algorythm.start();
		
        System.out.println(Arrays.toString(algorythm.getArray()));
    }
}
