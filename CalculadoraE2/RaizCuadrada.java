package calculadora;

public class RaizCuadrada extends Calculadora {
    public void operar(float numero) {
        if (numero >= 0) {
            setResultado((float) Math.sqrt(numero));
        } else {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo");
        }
    }
}
