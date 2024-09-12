/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_bridge;

import Abstraccion.*;
import Implementador_Color.*;
import Implementador_Talla.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practica_Bridge extends JFrame {

    private JComboBox<String> prendasComboBox;
    private JComboBox<String> coloresComboBox;
    private JComboBox<String> tallasComboBox;
    private JButton seleccionarButton;
    private JTextArea resultadoArea;

    public Practica_Bridge() {
        setTitle("Selector de Prenda");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 1));

        
        String[] prendas = {"Chaqueta", "Buzo", "Pantalon"};
        prendasComboBox = new JComboBox<>(prendas);

        
        String[] colores = {"Rojo", "Azul", "Amarillo"};
        coloresComboBox = new JComboBox<>(colores);

       
        String[] tallas = {"S", "M", "L"};
        tallasComboBox = new JComboBox<>(tallas);

      
        seleccionarButton = new JButton("Seleccionar");

       
        resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);

        
        add(new JLabel("Selecciona una prenda:"));
        add(prendasComboBox);
        add(new JLabel("Selecciona un color:"));
        add(coloresComboBox);
        add(new JLabel("Selecciona una talla:"));
        add(tallasComboBox);
        add(seleccionarButton);
        add(new JScrollPane(resultadoArea));

   
        seleccionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPrendaSeleccionada();
            }
        });
    }

    private void mostrarPrendaSeleccionada() {
        String prendaSeleccionada = (String) prendasComboBox.getSelectedItem();
        String colorSeleccionado = (String) coloresComboBox.getSelectedItem();
        String tallaSeleccionada = (String) tallasComboBox.getSelectedItem();

        
        Seleccion_color color = null;
        Seleccion_Talla talla = null;
        Abstract_prenda prenda = null;

      
        switch (colorSeleccionado) {
            case "Rojo":
                color = new Rojo();
                break;
            case "Azul":
                color = new Azul();
                break;
            case "Amarillo":
                color = new Amarillo();
                break;
        }

        switch (tallaSeleccionada) {
            case "S":
                talla = new Talla_S();
                break;
            case "M":
                talla = new Talla_M();
                break;
            case "L":
                talla = new Talla_L();
                break;
        }

      
        switch (prendaSeleccionada) {
            case "Chaqueta":
                prenda = new Chaqueta(color, talla);
                break;
            case "Buzo":
                prenda = new Buzo(color, talla);
                break;
            case "Pantalon":
                prenda = new Pantalon(color, talla);
                break;
        }


        resultadoArea.setText("Has seleccionado:\n");
        resultadoArea.append("Prenda: " + prendaSeleccionada + "\n");
        resultadoArea.append("Color: " + colorSeleccionado + "\n");
        resultadoArea.append("Talla: " + tallaSeleccionada + "\n");

        
    }

    public static void main(String[] args) {
        Practica_Bridge gui = new Practica_Bridge();
        gui.setVisible(true);
    }
}
