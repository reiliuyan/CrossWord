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
    private CrossWordPanelGrid[][] panel;
    int size;
    public static String VERTICAL = "vertical";
    public static String HORIZONTAL = "horizontal";
    
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
        panel = new CrossWordPanelGrid[n][n];
        for (int i=0; i<n;i++){
            for (int j=0; j<n;j++){
                panel[i][j]= new CrossWordPanelGrid();
            }
        }
        size = n;
    }
    
    /**
     * Set the char of grid by row and column number.
     * @param row row number
     * @param column column number
     * @param c the char to be set
     */
    public void setGrid(int row, int column, char c){
        panel[row][column].set(c);
    }
    
    public void addWord(String word, int row, int column, String direction){
        int length = word.length();
        if ((direction.equals(CrossWordPanel.HORIZONTAL) && column+length > size)
                ||(direction.equals(CrossWordPanel.VERTICAL) && row+length > size) ){
            System.out.println("No enough space.");
            return;
        }
        char[] chars = word.toCharArray();
        if (direction.equals(CrossWordPanel.HORIZONTAL)){
            
        }
        
    }
    /**
     * Prints out the whole panel. 
     */
    public void showPanel(){
        printLine(panel.length);
        for (int i=0; i<panel.length;i++){
            System.out.print("|");
            for (int j=0; j<panel.length;j++){
                System.out.print("  "+panel[i][j].get()+"  ");
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
            System.out.print("------");
        }
        System.out.print("\n");
    }
    
    public static void main(String[] args){
        int n = 10;
        CrossWordPanel cwp = new CrossWordPanel(n);
        for (int i=0; i<n;i++){
            for (int j=0; j<n;j++){
                cwp.setGrid(i, j, 'b');
            }
        }
        cwp.showPanel();
        
    }
}
