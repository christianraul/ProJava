package Controlador;

import Modelo.Deflibro;
import Modelo.Metlibro;
import Vista.formvista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Tadeo
 */
public class CtrlLibro implements ActionListener {

    private Deflibro li;
    private Metlibro met;
    private formvista vista;

    public CtrlLibro(Deflibro li, Metlibro met, formvista vista) {
        this.li = li;
        this.met = met;
        this.vista = vista;
        this.vista.btnguardar.addActionListener(this);

    }

    public void iniciar() {
        vista.setTitle("Registro de libros");
        vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnguardar) {
            li.setCodigo(Integer.parseInt(vista.txtcodigo.getText()));
            li.setTitulo(vista.txttitulo.getText());
            li.setAutor(vista.txtautor.getText());
            li.setFecha(vista.dchaño.getText());
            if (met.guardar(li)) {
                JOptionPane.showMessageDialog(null, "Libro Guardado");
            } else {
                JOptionPane.showMessageDialog(null, "Error en el Registro");
            }
        }

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
