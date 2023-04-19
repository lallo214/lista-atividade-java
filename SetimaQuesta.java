import java.util.Scanner;

public class SetimaQuesta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Primeira nota");
        Double nota1 = scanner.nextDouble();
        System.out.println("Segunda nota");
        Double nota2 = scanner.nextDouble();
        System.out.println("Terceira nota");
        Double nota3 = scanner.nextDouble();
        Double media = (nota1 + nota2*2 + nota3*3) / 6;
        if (media>=90){
            System.out.println("aprovado com A");
        }else if (media>=75 && media<90){
            System.out.println("aprovado com B");
        }else if (media>=60 && media<75){
            System.out.println("aprovado com C");
        }else if (media>=40 && media<60){
            System.out.println("reprovado com D");
        }else{
            System.out.println("reprovado com E");
        }
        scanner.close();



    }
    
}
