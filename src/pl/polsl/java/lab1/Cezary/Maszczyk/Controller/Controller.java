/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.java.lab1.Cezary.Maszczyk.Controller;

// packages containing class definitions 
import java.io.IOException;
import pl.polsl.java.lab1.Cezary.Maszczyk.Model.Model;
import pl.polsl.java.lab1.Cezary.Maszczyk.View.View;



/**
 * Controller class
 * 
 * @author Cezary Maszczyk
 * @version 1.0
 *
 */
public class Controller{
    private Model model;
    private View view;
    
     /**
     *Constructor for controller binding it with model and view
     * 
     * @param modelObject reference to model object
     * @param viewObject reference to view object
     */
    public Controller(Model modelObject, View viewObject){
        model = modelObject;
        view = viewObject;
    }

     /**
     *Reads
     * 
     * @param modelObject reference to model object
     * @param viewObject reference to view object
     */
    public void ReadWordsListFilePath(String filePath) {
        try{
            model.readWordList(filePath);
        }
        catch(IOException exception){
            view.printException(exception.getMessage());
        }  
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void StartLearning() {
        try{
            model.startLearning();
        }
        catch(IndexOutOfBoundsException exception){
            view.printException("The word list is empty.");
        }
    }

    public void GoToNextFlashcard() {
        try{
          model.getNextFlashcard();
        }
        catch(){
          
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void QuitAplication() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getFlashCard() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
