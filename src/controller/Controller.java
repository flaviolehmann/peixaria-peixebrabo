/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JFrame;

/**
 *
 * @author flavi
 * @param <V>
 */
public abstract class Controller<V extends JFrame> {
    
    protected V view;
    
    Controller(V view) {
        this.view = view;
        this.view.setVisible(true);
        this.addEventListeners();
    }
    
    abstract void addEventListeners();
    
    protected V getView() {
        return this.view;
    }
    
    protected void show() {
        this.view.setVisible(true);
    }
    
    protected void hide() {
        this.view.setVisible(false);
    }
}
