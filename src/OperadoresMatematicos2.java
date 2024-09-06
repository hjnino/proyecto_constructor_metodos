import java.util.Scanner;

public class OperadoresMatematicos2 {
    int num;
    int den;
    // Constructor
    public OperadoresMatematicos2(int numerador, int denonimador){
        this.num = numerador;
        this.den = denonimador;
    }

    public static void main(String[] args) {
        Scanner numeradorscanner = new Scanner(System.in);
        Scanner denominadorscanner = new Scanner(System.in);

        int numerador;
        int denominador;

        System.out.println("Digite un numero: ");
        numerador = numeradorscanner.nextInt();
        System.out.println("Digite otro numero: ");
        denominador = denominadorscanner.nextInt();

        OperadoresMatematicos2 ope = new OperadoresMatematicos2(numerador, denominador);
        System.out.println("La suma es:" + ope.suma());
        System.out.println("La resta es:" + ope.resta());
        System.out.println("La multiplicacion es: " + ope.multiplicacion());
        ope.division();

    }

    public int suma() {
        return this.num + this.den;
    }

    public int resta() {
        return this.num - this.den;
    }

    public int multiplicacion() {
        return this.num * this.den;
    }

    public void division() {
        if (this.den == 0) {
            System.out.println("No se puede dividir por cero");
        } else {
            System.out.println("La división es:" + this.num / this.den);
        }
    }
}