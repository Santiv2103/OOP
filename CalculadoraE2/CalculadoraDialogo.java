package calcu;

import javax.swing.JOptionPane;
import calculadora.*;

public class CalculadoraDialogo {

    public static void main(String[] args) {
        // Crear una instancia de la calculadora
        Calculadora calculadora = new Calculadora();

        // Ciclo para permitir al usuario realizar múltiples operaciones
        while (true) {
            // Menú de opciones para la calculadora
            String[] opciones = { "Sumar", "Restar", "Multiplicar", "Dividir", "Raíz Cuadrada", "Potencia", "Salir" };

            // Mostrar el menú de opciones y solicitar al usuario que elija una
            String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una operación:", "Calculadora",
                    JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

            // Si el usuario selecciona "Salir", salir del ciclo
            if (seleccion == null || seleccion.equals("Salir")) {
                JOptionPane.showMessageDialog(null, "Gracias por usar la calculadora.");
                break;
            }

            try {
                // Realizar la operación seleccionada por el usuario
                switch (seleccion) {
                    case "Sumar":
                        float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer número:"));
                        float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo número:"));
                        Suma suma = new Suma();
                        suma.setNumero1(numero1);
                        suma.setNumero2(numero2);
                        suma.operar();
                        calculadora.setResultado(suma.getResultado());
                        break;
                    case "Restar":
                        numero1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer número:"));
                        numero2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo número:"));
                        Resta resta = new Resta();
                        resta.setNumero1(numero1);
                        resta.setNumero2(numero2);
                        resta.operar();
                        calculadora.setResultado(resta.getResultado());
                        break;
                    case "Multiplicar":
                        numero1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer número:"));
                        numero2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo número:"));
                        Multiplicacion multiplicacion = new Multiplicacion();
                        multiplicacion.setNumero1(numero1);
                        multiplicacion.setNumero2(numero2);
                        multiplicacion.operar();
                        calculadora.setResultado(multiplicacion.getResultado());
                        break;
                    case "Dividir":
                        numero1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer número:"));
                        numero2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo número:"));
                        Division division = new Division();
                        division.setNumero1(numero1);
                        division.setNumero2(numero2);
                        division.operar();
                        calculadora.setResultado(division.getResultado());
                        break;
                    case "Raíz Cuadrada":
                        float numero = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el número para calcular la raíz cuadrada:"));
                        RaizCuadrada raizCuadrada = new RaizCuadrada();
                        raizCuadrada.operar(numero);
                        calculadora.setResultado(raizCuadrada.getResultado());
                        break;
                    case "Potencia":
                        numero1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el número base:"));
                        float exponente = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el exponente:"));
                        Potencia potencia = new Potencia();
                        potencia.operar(numero1, exponente);
                        calculadora.setResultado(potencia.getResultado());
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Operación no válida.");
                        continue;
                }

                // Mostrar el resultado de la operación al usuario
                JOptionPane.showMessageDialog(null, "El resultado es: " + calculadora.getResultado());

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada no válida. Por favor, ingrese un número válido.");
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        }
    }
}
