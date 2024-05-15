package calculadora;

import javax.swing.JOptionPane;

public class CalculadoraDialogo {

    public static void main(String[] args) {
        // Crear una instancia de la calculadora
        Calculadora calculadora = new Calculadora(0, 0);

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
                        calculadora.setNumero1(numero1);
                        calculadora.setNumero2(numero2);
                        calculadora.sumar();
                        break;
                    case "Restar":
                        numero1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer número:"));
                        numero2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo número:"));
                        calculadora.setNumero1(numero1);
                        calculadora.setNumero2(numero2);
                        calculadora.restar();
                        break;
                    case "Multiplicar":
                        numero1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer número:"));
                        numero2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo número:"));
                        calculadora.setNumero1(numero1);
                        calculadora.setNumero2(numero2);
                        calculadora.multiplicar();
                        break;
                    case "Dividir":
                        numero1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer número:"));
                        numero2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo número:"));
                        calculadora.setNumero1(numero1);
                        calculadora.setNumero2(numero2);
                        calculadora.dividir();
                        break;
                    case "Raíz Cuadrada":
                        float numero = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el número para calcular la raíz cuadrada:"));
                        calculadora.calcularRaizCuadrada(numero);
                        break;
                    case "Potencia":
                        numero1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el número base:"));
                        float exponente = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el exponente:"));
                        calculadora.calcularPotencia(numero1, exponente);
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
