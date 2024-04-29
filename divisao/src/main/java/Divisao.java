import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        try {
            System.out.println("Digite o num01:");
            int num01 = leitor.nextInt();

            System.out.println("Digite o num02:");
            int num02 = leitor.nextInt();

            System.out.println("Divisão: " + (num01 / num02));

        } catch (ArithmeticException ex) {
            System.out.println("Não foi possivel dividir: " + ex.getMessage());

        }catch (InputMismatchException ex){
            System.out.println("Digite um numero valido! " + ex.getMessage());

    }finally {
            System.out.println("Fim da tentativa");
        }
    }
}
