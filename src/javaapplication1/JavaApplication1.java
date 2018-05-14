/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import controllers.Controller1;
import java.awt.Dimension;
import models.Model1;
import views.MainFrame;

/**
 *
 * @author blegoh
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        MainFrame frame = new MainFrame();
        frame.setVisible(true);
        Model1 model = new Model1();
        Controller1 controller = new Controller1(model, frame);
    }
    
}
