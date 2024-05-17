package ui;

import calculadora.Calculadora1;
import calculadora.Operaciones;

import javax.swing.JOptionPane;

public class CalculadoraDialogo {

    public void iniciar() {
        // Crear una instancia de la calculadora
        Calculadora1 calculadora1 = new Calculadora1();

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
                float numero1, numero2;
                switch (seleccion) {
                    case "Sumar":
                        numero1 = obtenerNumero("Ingrese el primer número:");
                        numero2 = obtenerNumero("Ingrese el segundo número:");
                        Operaciones.sumar(calculadora1, numero1, numero2);
                        break;
                    case "Restar":
                        numero1 = obtenerNumero("Ingrese el primer número:");
                        numero2 = obtenerNumero("Ingrese el segundo número:");
                        Operaciones.restar(calculadora1, numero1, numero2);
                        break;
                    case "Multiplicar":
                        numero1 = obtenerNumero("Ingrese el primer número:");
                        numero2 = obtenerNumero("Ingrese el segundo número:");
                        Operaciones.multiplicar(calculadora1, numero1, numero2);
                        break;
                    case "Dividir":
                        numero1 = obtenerNumero("Ingrese el primer número:");
                        numero2 = obtenerNumero("Ingrese el segundo número:");
                        Operaciones.dividir(calculadora1, numero1, numero2);
                        break;
                    case "Raíz Cuadrada":
                        float numero = obtenerNumero("Ingrese el número para calcular la raíz cuadrada:");
                        Operaciones.calcularRaizCuadrada(calculadora1, numero);
                        break;
                    case "Potencia":
                        numero1 = obtenerNumero("Ingrese el número base:");
                        float exponente = obtenerNumero("Ingrese el exponente:");
                        Operaciones.calcularPotencia(calculadora1, numero1, exponente);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Operación no válida.");
                        continue;
                }

                JOptionPane.showMessageDialog(null, "El resultado es: " + calculadora1.getResultado());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada no válida. Por favor, ingrese un número válido.");
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
            }
        }
    }

    private static float obtenerNumero(String mensaje) throws NumberFormatException {
        String input = JOptionPane.showInputDialog(mensaje);
        if (input == null || input.trim().isEmpty()) {
            throw new NumberFormatException("Entrada vacía o nula.");
        }
        return Float.parseFloat(input);
    }
}
