/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraccion;

import Implementador_Talla.Seleccion_Talla;
import Implementador_Color.Seleccion_color; //importa la interfase

/**
 *
 * @author jorge malaver
 */
public class Buzo extends Abstract_prenda{
    
    public Buzo(Seleccion_color tono, Seleccion_Talla talla){
     super(tono, talla);   
    }
    
    @Override
    public void prenda(){//implementaion del metodo abstracto
        System.out.print("...Buzo  de color....");
        tono.Seleccionar_color();//llamado a la referencia del implementador
    }
}
