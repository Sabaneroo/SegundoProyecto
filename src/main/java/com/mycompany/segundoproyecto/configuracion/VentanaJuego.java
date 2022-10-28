/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.segundoproyecto.configuracion;

import com.mycompany.segundoproyecto.Datos;
import com.mycompany.segundoproyecto.Funciones;
import com.mycompany.segundoproyecto.ThreadCaminar;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.event.*;

/**
 *
 * @author deyla
 */
public class VentanaJuego extends javax.swing.JFrame {
    public int tamañobotones = 30;
    public int XbotonesJugables = 30;
    public int YbotonesJugables = 30;
    /**
     * Creates new form VentanaJuego
     */
    public VentanaJuego() {
        Datos ha = new Datos();
        
        initComponents();

        creaMatrizJugable();
        ThreadCaminar tr = new ThreadCaminar("base", 0, 0, 16, 10);
        tr.start();
        
        
    }
   
    public void creaMatrizJugable(){
        int contador = 0;
        for (int i = 0; i < 27; i++) {
            for (int j = 0; j < 27; j++) {
                JButton boton = new javax.swing.JButton();
                boton.setSize(tamañobotones,tamañobotones);
                boton.setLocation(j*tamañobotones, i*tamañobotones);
                boton.setText(j+"-"+i);
                boton.setIcon(new javax.swing.ImageIcon(Datos.ruta+"base.png"));
                Datos.matrizBotonesInterfaz[j][i] = boton;
                if (i == 0 || i == 26){
                    boton.setBackground(Color.red);
                    Datos.matrizBotonesApareceZombies[contador] = boton;
                    contador+=1;
                    boton.setIcon(new javax.swing.ImageIcon(Datos.ruta+"BaseBloqueada.png"));
                    
                }else{
                    if(j == 0 || j == 26){
                        boton.setBackground(Color.red);
                        Datos.matrizBotonesApareceZombies[contador] = boton;
                        contador+=1;
                        boton.setIcon(new javax.swing.ImageIcon(Datos.ruta+"BaseBloqueada.png"));
                    }
                }
                
                

                boton.addActionListener(al);
                pnlFondo.add(boton);
            }
        }
    }
    ActionListener al=new ActionListener(){
        public void actionPerformed (){
            System.out.println("holaaaaaaaaaaaa");
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < 27; i++) {
                for (int j = 0; j < 27; j++) {
                    
                    if (e.getSource() == Datos.matrizBotonesInterfaz[j][i]){
                        Funciones.FuncionBotones(j, i);
                        break;
                    }
                        
                }
            }
            
        }
      };

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(840, 840));

        pnlFondo.setPreferredSize(new java.awt.Dimension(830, 830));

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 858, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlFondo;
    // End of variables declaration//GEN-END:variables
}
