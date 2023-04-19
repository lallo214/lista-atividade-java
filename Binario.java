import java.util.Scanner;

public class Binario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero");
        Integer i = scanner.nextInt();
        System.out.println(Integer.toBinaryString(i));
    }
}
