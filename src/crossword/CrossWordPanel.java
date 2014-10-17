/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crossword;

/**
 * This class represents a n*n cross word panel to accommodate words.
 * 
 * @author Yan Liu
 * @version 1.0
 * 10/17/2014
 */
public class CrossWordPanel {
    private char[][] panel;
    
    /**
     * Constructor with no argument
     */
    public CrossWordPanel(){
    }
    
    /**
     * Constructor initializes the panel with required size.
     * 
     * @param n the number of grids in a row / column. 
     */
    public CrossWordPanel(int n){
        panel = new char[n][n];
    }
    
    
}
