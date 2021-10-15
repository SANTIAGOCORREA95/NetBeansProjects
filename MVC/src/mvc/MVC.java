/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import mvc.controlador.Controlador;
import mvc.modelos.Modelo;
import mvc.vistas.Vista;

/**
 *
 * @author 503
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vista vista = new Vista();
        vista.setVisible(true);
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(modelo,vista);
    }
    
}
