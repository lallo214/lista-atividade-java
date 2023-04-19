import java.util.Scanner;

public class SextaQuestao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calcule o valor final do seu produto\n Digite a valor do produto:");
        Double valor = scanner.nextDouble();
        System.out.println("Qual sera a forma de pagamento?\n boleto/pix/debito;\n creditoavista;\n creditoparcelado.");
        String forma = scanner.next();
        Double x = 0.0;
        if (forma.contains("pix") || forma.contains("boleto") || forma.contains("debito")){
            x = valor -(valor*0.10);
            System.out.println("No final o seu produto ira sair por: "+x);
        }else if (forma.contains("creditoparcelado")){
            System.out.println("numero de parcelas");
            Integer nParcelas = scanner.nextInt();
            x = valor + (valor*0.01*nParcelas);
            System.out.println("No final o seu produto ira sair por: "+x);
        

        }else {
            System.out.println("No final o seu produto ira sair por: "+valor);
        }

       
        }
    }

