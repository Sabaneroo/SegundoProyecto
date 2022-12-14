
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundoproyecto;

import com.mycompany.segundoproyecto.funciones.Defensa;
import com.mycompany.segundoproyecto.funciones.Modelo;
import com.mycompany.segundoproyecto.funciones.Personaje;

import com.mycompany.segundoproyecto.funciones.Zombie;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author deyla
 */


public class Datos {
    
    static public enum EstadoHaciendoMouse{
    CARGANDOPERSONAJE,
    MOVIENDOPILAR,
    NADA;
    }
    
    static public JButton[][] matrizBotonesInterfaz;
    static public Personaje[][] matrizPersonajes;
    static public JButton[] matrizBotonesApareceZombies;
    static public ArrayList<Personaje> personajes;
    static public ArrayList<Defensa> defensas;
    static public ArrayList<Defensa> defensasDisponibles;
    static public ArrayList<Defensa> defensasEnJuego;
    static public ArrayList<Zombie> ZombiesEnJuego;
    static public ArrayList<Defensa> DefensasCreadas;
    static public ArrayList<Zombie> ZombiesCreados;
    static public boolean jugando;
    static public ArrayList<ThreadCaminar> ThreadZombies;
    static public ArrayList<ThreadVolar> ThreadVoladores;
    static public  ArrayList<JButton> botonesdefensasDisponibles;
    
    static public javax.swing.JLabel labelResultado;
    static public javax.swing.JLabel label_campos_disponibles;
    static public ArrayList<Zombie> zombies;
    static public EstadoHaciendoMouse accionMouse;
    static public String personajeCargando;
    static public int maximo;
    //static public String ruta = "C:\\Users\\Jecheverria\\Personajes\\";//Modificar 
    //static public String Muerto = "C:\\Users\\Jecheverria\\Personajes\\DeadZombie.PNG";//Modificar 
    static public String ruta = "C:\\Users\\PC\\Pictures\\Personajes\\";//Modificar 
    static public String Muerto = "C:\\Users\\PC\\Pictures\\Personajes\\DeadZombie.PNG";//Modificar 


    static public Defensa Pilar;
    static public int[] coordsPilar;
    static public int campos;
    static public int nivel;
    public Datos() {
        accionMouse = EstadoHaciendoMouse.NADA;
        personajeCargando = null;
        nivel = 1;
        jugando = false;
        campos = 0;
        matrizBotonesInterfaz = new JButton[27][27];
        matrizPersonajes = new Personaje[27][27];
        matrizBotonesApareceZombies = new JButton[104];
        defensasDisponibles = new ArrayList<>();
        botonesdefensasDisponibles = new ArrayList<>();
        defensasEnJuego = new ArrayList<>();
        ZombiesEnJuego = new ArrayList<>();
        DefensasCreadas = new ArrayList<>();
        ZombiesCreados = new ArrayList<>();
        ThreadZombies = new ArrayList<>(); 
        ThreadVoladores = new ArrayList<>(); 
        
        maximo = 20;
        try {
            personajes =  new Modelo().read_personajes();
            zombies =  new Modelo().read_Zombies();
            defensas =  new Modelo().read_Defensas();
        } catch (IOException ex) {
           
           System.out.println("Error");
         Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Datos(int cont){
        
        
    }
    public static void ponePilar(int j,int i){
         //***********************
        ArrayList<ImageIcon> images = new ArrayList();
        BufferedImage bufferedImage;
        try {
            bufferedImage = ImageIO.read(new File(ruta+"Pilar.png"));
            Image image = bufferedImage.getScaledInstance(27, 27, Image.SCALE_DEFAULT);
            images.add(new ImageIcon(image));
            Pilar= new Defensa("Pilar",1,0,1,0,images,Personaje.tipoPilar);
            coordsPilar = new int[2];
            coordsPilar[0] = i;
            coordsPilar[1] = j;
            int[] pos = {j,i};
            Pilar.setPosicion(pos);
            defensasEnJuego.add(Pilar);
            
            
            matrizBotonesInterfaz[coordsPilar[0]][coordsPilar[1]].setIcon(Pilar.getApariencia().get(0));
            matrizPersonajes[coordsPilar[0]][coordsPilar[1]] = Pilar;

        } catch (IOException ex) {
            System.out.println("no cargo la imagen del pilar");
        }
        
    }
    
    
}
