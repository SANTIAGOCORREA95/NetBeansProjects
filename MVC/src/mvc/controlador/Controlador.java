/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mvc.modelos.Modelo;
import mvc.vistas.Vista;

/**
 *
 * @author 503
 */
public class Controlador implements ActionListener {
    
    private Vista vista = new Vista();
    private Modelo modelo = new Modelo();
    
    public Controlador(){
    }
    
    public Controlador(Modelo modelo, Vista vista){
        this.modelo = modelo;
        this.vista = vista;
        vista.boton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        modelo.setNumero1(Integer.parseInt(vista.caja1.getText()));
        modelo.setNumero2(Integer.parseInt(vista.caja2.getText()));
        
        
        vista.cajaResultado.setText(String.valueOf(modelo.sumar()));
        
    }
    
}
