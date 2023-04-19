import java.util.Scanner;

public class QuintaQuestao{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero");
        Integer numero = scanner.nextInt();
        Integer c = 0;
        if(numero>0){
            c = numero*2;
        } else {
            c = numero*3;
        }
        System.out.println(c);

        

    }
}