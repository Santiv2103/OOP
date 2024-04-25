import javax.swing.JOptionPane;

public class CalculadoraDialogo {

    public static void main(String[] args) {
        // Variables para almacenar los valores ingresados por el usuario
        float numero1, numero2;
        // Variable para almacenar el resultado de la operación
        float resultado = 0;

        // Menú de opciones para la calculadora
        String[] opciones = { "Sumar", "Restar", "Multiplicar", "Dividir", "Salir" };

        // Ciclo para permitir al usuario realizar múltiples operaciones
        while (true) {
            // Mostrar el menú de opciones y solicitar al usuario que elija una
            String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una operación:", "Calculadora",
                    JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

            // Si el usuario selecciona "Salir", salir del ciclo
            if (seleccion == null || seleccion.equals("Salir")) {
                JOptionPane.showMessageDialog(null, "Gracias por usar la calculadora.");
                break;
            }

            // Solicitar al usuario que ingrese dos números
            String strNumero1 = JOptionPane.showInputDialog("Ingrese el primer número:");
            String strNumero2 = JOptionPane.showInputDialog("Ingrese el segundo número:");

            // Convertir los números ingresados a valores flotantes
            try {
                numero1 = Float.parseFloat(strNumero1);
                numero2 = Float.parseFloat(strNumero2);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese números válidos.");
                continue; // Reiniciar el ciclo para permitir al usuario ingresar valores válidos
            }

            // Realizar la operación seleccionada por el usuario
            switch (seleccion) {
                case "Sumar":
                    resultado = numero1 + numero2;
                    break;
                case "Restar":
                    resultado = numero1 - numero2;
                    break;
                case "Multiplicar":
                    resultado = numero1 * numero2;
                    break;
                case "Dividir":
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                    } else {
                        JOptionPane.showMessageDialog(null, "No se puede dividir por cero.");
                        continue; // Reiniciar el ciclo para permitir al usuario ingresar un divisor válido
                    }
                    break;
                default:
                    // Si no se selecciona ninguna operación válida, mostrar un mensaje de error
                    JOptionPane.showMessageDialog(null, "Operación no válida.");
                    continue; // Reiniciar el ciclo para permitir al usuario seleccionar una operación válida
            }

            // Mostrar el resultado de la operación al usuario
            JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
        } 
    }
}
