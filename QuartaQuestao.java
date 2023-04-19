import java.util.Scanner;

public class QuartaQuestao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero");
        Integer a = scanner.nextInt();
        System.out.println("digite outro numero");
        Integer b = scanner.nextInt();
        final Integer c;
            if(a>b){
                c = a + b;
            System.out.println("seu primeiro numero foi maior que o segundo, entao os dois foram somados. o resultado foi: " + c);
            }else if(b>a){
                c = a * b;
        System.out.println("seu segundo numero foi maior que o primeiro, entao os dois foram multiplicados. o resultado foi: " + c);
        }else {
            System.out.println("parabens!!");
        }

    }
    
}
