/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraccion;

/**
 *
 * @author jorge malaver
 */
import Implementador_Talla.Seleccion_Talla;
import Implementador_Color.Seleccion_color;
public abstract class Abstract_prenda {//
    
   protected Seleccion_color tono; //referencia hacia  objeto implementador
   protected Seleccion_Talla talla;
   
   public Abstract_prenda(Seleccion_color tono, Seleccion_Talla talla){//referencia hacia la implementacion
    
       this.tono = tono; 
       this.talla = talla;
   }
   
   public abstract void prenda();//metodo a implementar n las clases concretas
   
 
   
   
}
