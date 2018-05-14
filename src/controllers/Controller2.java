/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Model1;
import models.Model2;
import views.MainFrame;
import views.Panel2;

/**
 *
 * @author blegoh
 */
public class Controller2 {

    Model2 model;
    MainFrame view;
    Panel2 panel;

    public Controller2(Model2 model, MainFrame view) {
        this.model = model;
        this.view = view;
        Panel2 panel = new Panel2();
        this.view.changePanel(panel);
        this.view.revalidate();
        this.view.repaint();
        this.view.addMenu1Listener(new Menu1Listener());
    }
    
    class Menu1Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Model1 model = new Model1();
            Controller1 controller = new Controller1(model, view);
        }
        
    }
}
