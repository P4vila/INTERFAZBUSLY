import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiVentanaSwing extends JFrame {
    private JButton ACEPTARButton;
    private JButton CANCELARButton;
    private JPanel PANEL;

    public MiVentanaSwing() {

        setContentPane(PANEL);

        // Damos un título al JFrame de MiVentana con setTitle
        setTitle("Mi ventana Modulo 1");

        // Damos tamaño al JFrame
        setSize(400, 200);

        // Hacemos visible la ventana, para cuando se ejecute nuestro programa aparezca en pantalla
        setVisible(true);

        //Para centrar nuestra pantalla al ejecutarla
        setLocationRelativeTo(null);

        // Para cuando le demos a cerrar la ventana, finalice la ejecución de nuestro programa
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //  ActionListener para el botón ACEPTAR con el mensaje que se pide en JOptionPane
        ACEPTARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar mensaje
                JOptionPane.showMessageDialog(MiVentanaSwing.this,"Has Aceptado", "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
            }
        });


        // ActionListener para el botón Cancelar para que se cierre el programa
        CANCELARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //  Mensaje en un JOptionPane
                JOptionPane.showMessageDialog(MiVentanaSwing.this, "Se cerrará el programa", "Información", JOptionPane.INFORMATION_MESSAGE);
                // Cerrar el programa
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        // Crear y mostrar la ventana
        SwingUtilities.invokeLater(() -> new MiVentanaSwing());
    }
}

