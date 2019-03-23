package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

public class Controlador implements ActionListener {

    private Vista view;
    private Modelo model;

    public Controlador(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.btnMultiplicar.addActionListener(this);
    }

    public void iniciar() {
        view.setTitle("VENTANA DE EJERCICIO");
        view.setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        model.setNumerouno(Integer.parseInt(view.txtNumero1.getText()));
        model.setNumerodos(Integer.parseInt(view.txtNumero2.getText()));
        model.Multiplicar();
        view.txtResultado.setText(String.valueOf(model.getResultado()));
    }

}
