package calculadora;

public class Division extends Calculadora {
    public void operar() {
        if (getNumero2() != 0) {
            setResultado(getNumero1() / getNumero2());
        } else {
            throw new ArithmeticException("División por cero");
        }
    }
}
