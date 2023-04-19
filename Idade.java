import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> idades = new ArrayList<>();

        for (int i = 1; i <= 12; i++) {
            System.out.println("Digite uma idade");
            idades.add(scanner.nextInt());
        }
        System.out.println("menor idade "+idades.stream().min(Integer::compareTo).get());
        System.out.println("maior idade "+idades.stream().max(Integer::compareTo).get());
        
        scanner.close();
    }
}
