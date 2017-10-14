/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.java.lab1.Cezary.Maszczyk.View;

import pl.polsl.java.lab1.Cezary.Maszczyk.Model.ModelInterface;


/**
 * View class of the aplication
 * 
 * @author Cezary Maszczyk
 * @version 1.0
 *
 */
public class View {
    private ModelInterface model;
    
    public View(ModelInterface modelObject){
        model = modelObject;
    }

    public void showFlashCardWord() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void showFlashCardAnswer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
    
    public void printException(String message){
        System.err.println(message);
    }
}
