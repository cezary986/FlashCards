/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.java.lab1.Cezary.Maszczyk.Model;

/**
 *
 * @author cezary
 */
public class FlashCard {
    private String word, translation;
    
    public FlashCard(String flashCardWord, String flashCardTranslation){
        word = flashCardWord;
        translation = flashCardTranslation;
    }
    
    String getWord(){ return word;}
    String getTranslation(){ return translation;}
}

