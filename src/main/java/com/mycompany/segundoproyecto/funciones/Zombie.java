/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundoproyecto.funciones;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author jecheverria
 */
public class Zombie extends Personaje{

    public Zombie(String Nombre, int Vida, int DañoPorSegundo, int NivelAparicion, ArrayList<ImageIcon> Apariencia, Tipo TipoDeAtaque) {
        super(Vida, DañoPorSegundo, Nombre, Apariencia, TipoDeAtaque, NivelAparicion);
    }

    
}
