import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double number1, number2, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva o raio de um cilindro: ");
        number1 = in.nextInt();

        System.out.println("Escreva a altura de um cilindro");
        number2 = in.nextInt();

        result = (number1 * number1) * number2 * Math.PI;
        System.out.println("O volume desse cilindro é: " + result);
    }
}