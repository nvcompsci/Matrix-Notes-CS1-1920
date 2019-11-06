/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixnotes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author jword
 */
public class MatrixNotes extends JPanel{
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);		
        g.setColor(Color.RED);
        
        int[][] circles = new int[10][10];
        //Nested for loop
        for (int i = 0; i < 10; i++) {
            for ( int j = 0; j < 10; j++ ) {
                //System.out.println("hi chirckern");
                circles[i][j] = (int) (Math.random()*25);
                //System.out.print("\t"+circles[i][j]);
            }
            //System.out.print("\n");
        }
        
        //Nested for-each loops
        int y = 0;
        for (int[] row : circles) {
            int x = 0;
            for (int circle : row) {
                x += 25;                
                g.fillOval(x, y, circle, circle);
                //System.out.print("\t"+circle);
            }
            y += 25;
            //System.out.print("\n");
        }
        
        Gradebook gb = new Gradebook();
        gb.addGrades();
        gb.showGrades();
        
//        int x = 10;
//        int y = 100;
//        int size = 50;             
//
//        g.fillRect(x, y, size, size); 		
    }
    
    public static void main(String[] args) {
        JFrame f = new JFrame("Matrix Notes");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MatrixNotes gc = new MatrixNotes();
        f.add(gc);
        f.pack();
        f.setSize(600,400);
        f.setPreferredSize(new Dimension(600, 400));
        f.setVisible(true);        
    }
    
}
