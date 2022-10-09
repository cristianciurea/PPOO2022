
package ro.ase.course1.arrays;

public class JavaMultidimArrays {
    
    public static void main(String[] args) {
        
        //define a two-dimension matrix
        // Java recommended syntax
        int[][] m1;
        // C and C++ like syntax
        long m2[][];
        
        //define a three-dimension matrix
        int[][][] cube;
     
        //define a matrix with 3 lines and unspecified number of columns
        int[][] m3;
        //create
        m3 = new int[3][];
        //the first line or array
        m3[0] = new int[3];
        //the second line
        m3[1] = new int[3];
        //the third line
        m3[2] = new int[3];
        
        //define a zig-zag matrix with 3 lines
        int[][] zigZag;
        //create the array of arrays with 3 references
        zigZag = new int[3][];
        //the first line or array
        zigZag[0] = new int[5];
        //the second line
        zigZag[1] = new int[4];
        //the third line
        zigZag[2] = new int[3];
        
        //initialize the first line elements with value 3
        for(int j = 0; j < zigZag[0].length; j++)
            zigZag[0][j] = 3;
        for(int j = 0; j < zigZag[1].length; j++)
            zigZag[1][j] = 4;
        for(int j = 0; j < zigZag[2].length; j++)
            zigZag[2][j] = 5;
        
        //initialize the second element of the second line with 10
        //zigZag[1][1] = 10;
 
        //determine the sum of its elements
        int sum = 0;
        for(int i = 0; i < zigZag.length; i++)
            for(int j = 0; j < zigZag[i].length; j++)
                sum += zigZag[i][j];
 
        System.out.println(sum);
    }
}
