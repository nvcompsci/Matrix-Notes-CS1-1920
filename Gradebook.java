/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixnotes;

/**
 *
 * @author jword
 */
public class Gradebook {
    //Create array here 160 students, 15 assignments
    int[][] grades = new int[160][15];    
    
    //Randomly fills gradebook with grades 0-100
    public void addGrades() {
        
      for (int i = 0; i < 160; i++) {
          for (int j = 0; j < 15; j++) {           
              grades[i][j] = (int) (Math.random() * 100);
          }
      }
        
    }
    
    //Shows all grades in console
    public void showGrades() {
        for (int[] row : grades) {
            System.out.print("Avg: "+calcFinalGrades(row));
            for (int grade : row) {
                System.out.print("\t"+grade);
            }
            System.out.print("\n");
        }
    }
    
    
    public int calcFinalGrades(int[] row) {
        int sum = 0;
        int count = 0;
        //50, 100, 50
        for (int grade : row) {
            //200 = 150 + 50
            //sum = sum + row[i];
            sum = sum + grade;
            count++; // count = count + 1
        }
        //66 = (50 + 100 + 50) / 3
        int avg = sum / count;
        return avg;
    }
}
