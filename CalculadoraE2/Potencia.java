package calculadora;

public class Potencia extends Calculadora {
    public void operar(float base, float exponente) {
        setResultado((float) Math.pow(base, exponente));
    }
}
