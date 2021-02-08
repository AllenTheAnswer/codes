package javaapplication2.newpackage;
import java.util.Scanner;
public class Matrix {
    public static void main(String [] args){
        int [][]a = new int[3][3];
        int [][]b = new int[3][3];
        int [][]c = new int[3][3];
        int [][]e = new int[3][3];
        int [][]f = new int[3][3];
        int [][]g = new int[3][3];
        int [][]h = new int[3][3];
       entermatrix(a);
       entermatrix(b);
       entermatrix(c);
       matrixBsquare(b,e);
       matrixBsquaredby3(e,b);
       matrixCcubeonce(c,f);
       matrixCcubetwice(f,c,g);
       formula(a,b,g,h);
       System.out.println("THREE BY THREE MATRIX TO SOLVE:  A + 3B^2 + C^3");
       System.out.println("Answer is:");
       finalanswer(h);
    }
    
    public static void entermatrix(int[][]x){
        System.out.println("Enter matrix :");
        Scanner in = new Scanner(System.in);
        for(int row = 0; row < x.length; row++){
            for(int col = 0; col < x.length;col++){
              System.out.println("row" + (row+1) + "colunm" + (col +1));
              x[row][col] = in.nextInt();
        }
        }
    }

        public static void matrixBsquare(int[][]x, int [][] y){
           for(int row = 0; row < x.length; row++){
             for(int col = 0; col < x.length; col++){
                for(int k = 0; k < x.length; k++){
                    y[row][col] = y[row][col] + x[row][k] * x[k][col];
                } } } }
        
          public static void matrixBsquaredby3(int[][]x, int [][] y){
           for(int row = 0; row < x.length; row++){
             for(int col = 0; col < x.length; col++){
                    y[row][col] = 3 * x[row][col];
             } } }
          
           public static void matrixCcubeonce(int[][]x, int [][] y){
           for(int row = 0; row < x.length; row++){
             for(int col = 0; col < x.length; col++){
                for(int k = 0; k < x.length; k++){
                    y[row][col] = y[row][col] + x[row][k] * x[k][col];
                }
             }
           }
           }
           
            public static void matrixCcubetwice(int[][]x, int [][] y, int [][]z){
           for(int row = 0; row < x.length; row++){
             for(int col = 0; col < x.length;col++){
                for(int k = 0; k < x.length; k++){
                    z[row][col] = z[row][col] + x[row][k] * y[k][col];
                     }
                 }
               }
            }
            
            public static void formula(int[][]x, int[][]y, int[][]z, int[][]m){
                    for(int row = 0; row < x.length; row++){
                        for(int col = 0; col < x.length; col++){
                            m[row][col]= x[row][col] + y[row][col] + z[row][col];
                        }  } }
            
             public static void  finalanswer(int[][]x){
                  for(int row = 0; row < x.length; row++){
                        for(int col = 0; col < x.length; col++){
                            System.out.print(x[row][col] + " ");
                        }  
                        System.out.println();
                  } } }
    
   