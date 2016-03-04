/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1601.lessons;

import java.util.Random;
import java.util.Scanner;
//import java.util.Scanner;

/**
 *
 * @author Егор
 */
public class MatrixOperations {
    public static void main(String[] args) {
        
        //first matrix
        int[][] firstMatrix  = new int[5][5];
        Random f=new Random(); 
        System.out.println("____________1stMatrix_________-");
        for (int i = 0;i < 5; i++) {
            for (int j =0; j < 5; j++){
                firstMatrix[i][j] = f.nextInt(20);
                System.out.print(firstMatrix[i][j]+"\t");
            }
            System.out.println();
        }
        
        //second matrix
        int[][] secondMatrix  = new int[5][5];
        System.out.println("____________SecondMatrix_____________");
        for (int a = 0;a < 5; a++) {
            for (int b =0; b < 5; b++){
                secondMatrix[a][b] = f.nextInt(20);
                System.out.print(secondMatrix[a][b]+"\t");
            }
            System.out.println();
        }
        
        //matrix summ
        int[][] summedMatrix  = new int[5][5];  
        System.out.println("____________AllMatrixSumm_________-");
        for (int d = 0;d < 5; d++) {
            for (int c =0; c < 5; c++){
                summedMatrix[d][c] = secondMatrix[d][c] +firstMatrix[d][c];
                System.out.print(summedMatrix[d][c]+"\t");
            } 
            System.out.println();               
        }
        
                      
        //matrix multiply
        int[][] multipliedMatrix  = new int[5][5];  
        System.out.println("____________AlMultiplyMatrix_________-");
        for (int x = 0;x < 5; x++) {
            for (int y =0; y < 5; y++){
                multipliedMatrix[x][y] = (secondMatrix[x][y])*(firstMatrix[x][y]);
                System.out.print(multipliedMatrix [x][y]+"\t");
            }
            System.out.println(); 
        }
        
         //matrix multiply on numb
         int[][] multiplyMatrixonNumb  = new int[5][5];  
            Scanner in = new Scanner(System.in);
            System.out.print("u = ");
            int u=in.nextInt();
            
        System.out.println("____________Matrix multiply on numb_________-");
        for (int p = 0;p < 5; p++) {
            for (int z =0; z < 5; z++){
                multiplyMatrixonNumb[p][z] = (firstMatrix[p][z]*u);
                System.out.print(multiplyMatrixonNumb[p][z]+"\t");
             } 
            System.out.println();
       }
        // transportation
         int[][] TransportationMatrix  = new int[5][5];  
        System.out.println("____________TransportationMatrix_________-");
        for (int x = 0;x < 5; x++) {
            for (int y =0; y < 5; y++){
                TransportationMatrix[x][y] = (secondMatrix[y][x]);
                System.out.print(TransportationMatrix[x][y]+"\t");
            }
            System.out.println(); 
        }
      }  
     }



