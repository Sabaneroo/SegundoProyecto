/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundoproyecto.funciones;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author jecheverria
 */
public class ModeloP {
 
    
 public ArrayList<Personaje> read_personajes() throws FileNotFoundException, IOException{
        ArrayList<Personaje> personajes = new ArrayList();
        ArrayList<Defensa> defensas = new ArrayList();
        ArrayList<Zombie> zombies = new ArrayList();
        File file = new File("Personajes.txt");
        BufferedReader Lector = new BufferedReader(new FileReader(file));
        String archivo;
        archivo = Lector.readLine();
        
        String[] personajes_archivo = archivo.split("%");
        for (String personaje : personajes_archivo){
            
            String[] atributos = personaje.split("/");
            ArrayList<ImageIcon> images = new ArrayList(); 
            Tipo tipo_personaje = null;
            if (atributos.length == 8){
                System.out.println(personaje);
            
                
                 
                BufferedImage bufferedImage= ImageIO.read(new File(atributos[6]));
                Image image = bufferedImage.getScaledInstance(30, 30, Image.SCALE_DEFAULT);
                
                images.add(new ImageIcon(image));
                bufferedImage= ImageIO.read(new File(atributos[7]));;
                image = bufferedImage.getScaledInstance(30, 30, Image.SCALE_DEFAULT);
            }
//                if (atributos[0].equals("D")){
//                    switch(atributos[1]){
//                            case "C":
//                                tipo_personaje = Tipo.CONTACTO;
//                                break;
//                            case "MA":
//                                tipo_personaje = Tipo.MEDIOALCANCE;                   
//                                break;
//                            case "A":
//                                tipo_personaje = Tipo.AEREO;
//                                break;
//                            case "I":      
//                                tipo_personaje = Tipo.IMPACTO;
//                                break;         
//                            case "AM":
//                                tipo_personaje = Tipo.ATAQUEMULTIPLE;
//                                break;
//                            case "B":      
//                                tipo_personaje = Tipo.BLOQUE;
//                                break;
//                    }
//                    personajes.add(new Defensa(atributos[2],Integer.parseInt(atributos[3]),Integer.parseInt(atributos[4])
//                        ,Integer.parseInt(atributos[5]),images ,tipo_personaje));
//                    defensas.add(new Defensa(atributos[2],Integer.parseInt(atributos[3]),Integer.parseInt(atributos[4])
//                        ,Integer.parseInt(atributos[5]),images,tipo_personaje));
//                }
//
//                if (atributos[0].equals("Z")){
//                    switch(atributos[1]){
//                        case "C":
//                            tipo_personaje = Tipo.CONTACTO;
//                            break;
//                        case "MA":
//                            tipo_personaje = Tipo.MEDIOALCANCE;                   
//                            break;
//                        case "A":
//                            tipo_personaje = Tipo.AEREO;
//                            break;
//                        case "I":      
//                            tipo_personaje = Tipo.IMPACTO;
//                            break;
//                    }
//                    personajes.add(new Zombie(atributos[2],Integer.parseInt(atributos[3]),Integer.parseInt(atributos[4])
//                        ,Integer.parseInt(atributos[5]),images,tipo_personaje));
//                    zombies.add(new Zombie(atributos[2],Integer.parseInt(atributos[3]),Integer.parseInt(atributos[4])
//                        ,Integer.parseInt(atributos[5]),images,tipo_personaje));
//                }
//            }
//            else{}
//        }
//        for (Personaje persona : personajes){
//            persona.tostring();}
//        return personajes;
    }
     return null;

    }
}
