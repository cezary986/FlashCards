/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.java.lab1.Cezary.Maszczyk.Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.IndexOutOfBoundsException;

/**
 * Model class of the aplication
 * 
 * @author Gall Anonim
 * @version 1.0
 *
 */
public class Model implements ModelInterface {
    private ArrayList<FlashCard> flashCardsList;
    int indexOfCurrentFlashCard;

    public Model() {
        flashCardsList = new ArrayList<>();
        indexOfCurrentFlashCard = 0;
    }
    
    public void loadWordListFromFile(String fileName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void startLearning() {
        if(flashCardsList.isEmpty()){
            //throw smth...
        }
        else{
        Collections.shuffle(flashCardsList);
        }
    }

    @Override
    public FlashCard getNextFlashcard() throws IndexOutOfBoundsException{
        if(flashCardsList.isEmpty()){
            throw  new IndexOutOfBoundsException();
        }
        else{
            try{
                return flashCardsList.get(indexOfCurrentFlashCard++);
            }
            catch( IndexOutOfBoundsException exception){
                throw new IndexOutOfBoundsException();
            }
        }
    }
    
    public void readWordList(String filePath) throws IOException
    {
        BufferedReader fileReader = null;
        String line;
        String[] words;
        FlashCard flashCard;

        try {
            fileReader = new BufferedReader(new FileReader(filePath));
            
            line = fileReader.readLine();
            while(line != null){       
                words = (line).split(" +");    
                
                flashCard = new FlashCard(words[0], words[1]);
                flashCardsList.add(flashCard);
                
                line = fileReader.readLine();
            } 
        }
        catch(IOException ioException){
            
            if (fileReader != null) {
                Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ioException);
                try {
                    fileReader.close();
                }
                catch (IOException exception) {
                    Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, exception);
                }
            }
            throw ioException;
        }
    }
    
    public void printWords(){
        flashCardsList.forEach((flashCard) -> {
            System.out.println(flashCard.getWord() + " " + flashCard.getTranslation());
        });
    }
    
}
