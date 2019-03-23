package pracmvc;

import Controlador.CtrlLibro;
import Modelo.Deflibro;
import Modelo.Metlibro;
import Vista.formvista;

/**
 *
 * @author Tadeo
 */
public class PRACmvc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metlibro met = new Metlibro();
        Deflibro li = new Deflibro();
        formvista vista = new formvista();

        CtrlLibro control = new CtrlLibro(li, met, vista);
        control.iniciar();
        vista.setVisible(true);
    }

}
