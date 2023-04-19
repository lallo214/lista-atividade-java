import java.util.Scanner;

public class Escada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um nivel");
        int nivel = scanner.nextInt();
        scanner.close();
        for(int i=0; i <= nivel; i++){
            for(int j=1; j<=i; j++){
            System.out.println("*");
        }        
        System.out.println();
        
    }
    }
}
