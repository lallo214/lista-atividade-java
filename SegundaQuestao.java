import java.util.Scanner;

public class SegundaQuestao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero");
        Double x = scanner.nextDouble(); 
        System.out.println("digite outro numero");
        Double y = scanner.nextDouble();
        Double soma = x + y;
        System.out.println("o resultado da some é " + soma); 

        
    }
}
