import java.util.Scanner;

public class OitavaQuestao {
    public static void main(String[] args) {
        //F = (°C x 1,8) + 32 | K − 273,15 = °C

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a temperatura em celsius?");
        Double tempC = scanner.nextDouble();
        Double tempF = (tempC*1.8) + 32;
        Double tempK = tempC + 273.75;
        System.out.println(tempF+ "F");
        System.out.println(tempK+ "K");
    }
}
