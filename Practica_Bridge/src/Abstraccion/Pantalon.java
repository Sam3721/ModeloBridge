/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraccion;

import Implementador_Talla.Seleccion_Talla;
import Implementador_Color.Seleccion_color;

/**
 *
 * @author jorge malaver
 */
public class Pantalon extends Abstract_prenda {
 
    
    public Pantalon(Seleccion_color tono, Seleccion_Talla talla){
     super(tono, talla);     
    }
    
    @Override
    public void prenda(){
        System.out.print("...Pantalon  de color.....");
        tono.Seleccionar_color();
    }
}
