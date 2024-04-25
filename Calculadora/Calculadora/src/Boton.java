import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JTextField;


class Boton implements ActionListener {
    private JTextField pantalla;
    private String nombre;

    public Boton(JTextField pantalla, String nombre) {
        this.pantalla = pantalla;
        this.nombre = nombre;
    }

    public void actionPerformed(ActionEvent e) {
        String textoPantalla = pantalla.getText();

        if (nombre.equals("=")) {
            try {
                float resultado = (float) new ScriptEngineManager().getEngineByName("JavaScript").eval(textoPantalla);
                pantalla.setText(Float.toString(resultado));
            } catch (ScriptException ex) {
                pantalla.setText("Error");
            }
        } else if (nombre.equals("C")) {
            if (textoPantalla.length() > 1) {
                pantalla.setText(textoPantalla.substring(0, textoPantalla.length() - 1));
            } else {
                pantalla.setText("0");
            }
        } else {
            if (textoPantalla.equals("0")) {
                pantalla.setText(nombre);
            } else {
                pantalla.setText(textoPantalla + nombre);
            }
        }
    }
}