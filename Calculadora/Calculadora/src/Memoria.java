import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

class Memoria implements ActionListener {
    private JTextField pantalla;

    public Memoria(JTextField pantalla) {
        this.pantalla = pantalla;
    }

    public void actionPerformed(ActionEvent e) {
        pantalla.setText(Float.toString(CalculadoraGUI.memoria));
    }
}
