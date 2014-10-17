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
     * @param n the number of grids in a row / column
     */
    public CrossWordPanel(int n){
        panel = new char[n][n];
    }
    
    /**
     * Set the char of grid by row and column number.
     * @param row row number
     * @param column column number
     * @param c the char to be set
     */
    public void setGrid(int row, int column, char c){
        panel[row][column] = c;
    }
    
    /**
     * Prints out the whole panel. 
     */
    public void showPanel(){
        printLine(panel.length);
        for (int i=0; i<panel.length;i++){
            System.out.print("|");
            for (int j=0; j<panel.length;j++){
                System.out.print(" "+panel[i][j]+" ");
                System.out.print("|");
            }
            System.out.print("\n");
            printLine(panel.length);
        }
    }
    
    /**
     * Prints a line.
     * @param n the number of grids in a row / column
     */
    private void printLine(int n){
        for (int i=0; i<n; i++){
            System.out.print("----");
        }
        System.out.print("\n");
    }
    
    public static void main(String[] args){
        CrossWordPanel cwp = new CrossWordPanel(5);
        for (int i=0; i<5;i++){
            for (int j=0; j<5;j++){
                cwp.setGrid(i, j, 'a');
            }
        }
        cwp.showPanel();
        
    }
}
