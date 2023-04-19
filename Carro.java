import java.util.Scanner;

    public class Carro{

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("quantas rodas tem seu veiculo?");
        Double rodas = scanner.nextDouble();
        System.out.println("qual o peso bruto do seu veiculo?");
        Double peso = scanner.nextDouble();
        System.out.println("quantas pessoas cabe no veiculo");
        Double capacidade = scanner.nextDouble();
        scanner.close();
        if(rodas<=3){
            System.out.println("categoria A");
        }
        else if(rodas==4 && capacidade<8 && peso<3500){
            System.out.println("categoria B");
        }
        else if(rodas>=4 && peso>=3500 && peso<=6000){
            System.out.println("categoria C");
        }
        else if(rodas>=4 && capacidade>8){
            System.out.println("categoria D");
        }
        else if(rodas>=4 && peso>6000){
            System.out.println("categoria E");
        }
    }
}
