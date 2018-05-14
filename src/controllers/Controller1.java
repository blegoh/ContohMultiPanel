/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Model1;
import models.Model2;
import views.MainFrame;
import views.Panel1;
import views.Panel2;

/**
 *
 * @author blegoh
 */
public class Controller1 {
    
    Model1 model;
    MainFrame view;
    Panel1 panel;

    public Controller1(Model1 model, MainFrame view) {
        this.model = model;
        this.view = view;
        panel = new Panel1();
        this.view.changePanel(panel);
        this.view.revalidate();
        this.view.repaint();
        this.view.addMenu2Listener(new Menu2Listener());
        this.panel.addButtonListener(new ButtonListener());
    }
    
    class Menu2Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Model2 model = new Model2();
            Controller2 controller = new Controller2(model, view);
        }
        
    }
    
    class ButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            panel.setLabel("test 1");
        }
        
    }
    
    
}
