import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Primer numero
        System.out.print("Indica el primer numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Indica el segundo numero: ");
        int numero2 = scanner.nextInt();

        System.out.println("que tipo de operacion quieres realizar?");
        System.out.println("Escribe + para sumar");
        System.out.println("Escribe - para restar");
        System.out.println("Escribe * para multiplicar");
        System.out.println("Escribe / para dividir (division entera)");
        System.out.println("Escribe la operacion");

        char operacion = scanner.next().charAt(0);

        int resultado = 0;
        boolean operacionValida = true;

        if (operacion == '+') {
            resultado = numero1 + numero2;
        } else if (operacion == '-') {
            resultado = numero1 - numero2;
        } else if (operacion == '*') {
            resultado = numero1 * numero2;
        } else if (operacion == '/') {
            if (numero2 == 0) {
                System.out.println("No se puede dividir por 0");
                operacionValida = false;
            } else {
                resultado = numero1 / numero2;
            }
        } else {
                System.out.println("Error, solo se puede usar +, -, *, /.");
                operacionValida = false;
            }

            System.out.println("El resultado de tu operacion es: "+ resultado);


        }

    }




