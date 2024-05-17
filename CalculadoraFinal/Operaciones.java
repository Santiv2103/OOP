package calculadora;

public class Operaciones {
    public static void sumar(Calculadora1 calculadora, float numero1, float numero2) {
        calculadora.setResultado(numero1 + numero2);
    }

    public static void restar(Calculadora1 calculadora, float numero1, float numero2) {
        calculadora.setResultado(numero1 - numero2);
    }

    public static void multiplicar(Calculadora1 calculadora, float numero1, float numero2) {
        calculadora.setResultado(numero1 * numero2);
    }

    public static void dividir(Calculadora1 calculadora, float numero1, float numero2) {
        if (numero2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        calculadora.setResultado(numero1 / numero2);
    }

    public static void calcularRaizCuadrada(Calculadora1 calculadora, float numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        calculadora.setResultado((float) Math.sqrt(numero));
    }

    public static void calcularPotencia(Calculadora1 calculadora, float base, float exponente) {
        calculadora.setResultado((float) Math.pow(base, exponente));
    }
}

