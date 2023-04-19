import java.util.Scanner;

public class NonaQuestao{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero");
        Double n1 = scanner.nextDouble();
        System.out.println("digite outro numero");
        Double n2 = scanner.nextDouble();
        Double soma = n1 + n2;
        System.out.println("soma " +soma);
        Double subtracao = n1 - n2;
        System.out.println("subtracao "+ subtracao);
        Double divisao = n1/n2;
        System.out.println("divisao "+ divisao);
        Double multiplicacao = n1*n2;
        System.out.println("multiplicacao "+multiplicacao);
    }
    
}
