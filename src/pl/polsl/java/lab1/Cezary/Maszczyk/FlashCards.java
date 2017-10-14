package pl.polsl.java.lab1.Cezary.Maszczyk;

import pl.polsl.java.lab1.Cezary.Maszczyk.Controller.Controller;
import pl.polsl.java.lab1.Cezary.Maszczyk.Model.Model;
import pl.polsl.java.lab1.Cezary.Maszczyk.View.View;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Cezary Maszczyk
 */
public class FlashCards {

    /**
     * Main method of application uses the model, view and controller
     * classes
     * 
     * @param args command line parameters
     */
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View(model);
        Controller controller = new Controller(model, view);
        
        model.readWordList("C:\\Users\\cezary\\Documents\\NetBeansProjects\\FlashCards\\wordList.txt");
        model.printWords();
        model.startLearning();
        model.printWords();
        
        //TODO logic goes here
    }
    
}
