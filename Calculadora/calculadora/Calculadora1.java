package calculadora;

import javax.swing.JOptionPane;

public class Calculadora1 {
    private float numero1;
    private float numero2;
    private float resultado; 

    public Calculadora1(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public float getResultado() {
        return resultado;
    }

    public void sumar() {
        resultado = numero1 + numero2;
    }

    public void restar() {
        resultado = numero1 - numero2;
    }

    public void multiplicar() {
        resultado = numero1 * numero2;
    }

    public void dividir() {
        if (numero2 != 0) {
            resultado = numero1 / numero2;
        } else {
            JOptionPane.showMessageDialog(null, "No se puede dividir por cero.");
        }
    }

    public void calcularRaizCuadrada(float numero) {
        if (numero >= 0) {
            resultado = (float) Math.sqrt(numero);
        } else {
            JOptionPane.showMessageDialog(null, "No se puede calcular la raíz cuadrada de un número negativo.");
        }
    }

    public void calcularPotencia(float base, float exponente) {
        resultado = (float) Math.pow(base, exponente);
    }
}
