/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crossword;

/**
 *
 * @author Yan Liu
 */
public class CrossWordPanelGrid {
    private char c;
    
    public CrossWordPanelGrid(){
        
    }
    
    public CrossWordPanelGrid(char c){
        this.c = c;
    }
    
    public char get(){
        return c;
    }
    
    public void set(char c){
        this.c = c;
    }
}
