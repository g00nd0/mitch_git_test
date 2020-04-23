package Java;

import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedList; //can be used for queues
import java.util.ListIterator;


public class QuickStart{
 
    public static void main(String[] args){
        
        int[][] data = {
            {4,6,3,10},
            {4,2,40,1}, //all 2D arrays in java are jagged arrays, meaning can be of any size (rows, or vice versa)
            {5,34,1,43}

        };
        
       //System.out.println(data[1][2]); calling a specific element in 2D array
       

        for(int i=0; i < data.length; i++){
            for(int j=0; j < data[i].length; j++){
                System.out.print(data[i][j]+" ");
                
            }
            System.out.println();
        }
    }
    


}