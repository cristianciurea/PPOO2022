
package ro.ase.course1.arrays;

public class JavaArrays {
    
    public static void main(String[] args) {
        
        //defining an array with the recommended syntax for Java
        int[] intValues;
	    //define array with vector-like syntax in C/C++
        long longValues[];
        
        //allocating space = array initialization
        intValues =  new int [10]; // 10 elements with value 0
        longValues =  new long [5];   //5 elements with value 0
        
        intValues [0]  =  10;    //initialize first element
        intValues [1]  =  20;    //initialization of the 2nd element
        intValues [2]  =  30;    //initialization of the 3rd element
        
        //allocating space + definition + initialization
        //array with five elements with char data type values
        char[] charValues = {'H','e','l','l','o'};
        //determine the length of the array
        int charNumber = charValues.length;
	    // modify the value of the first element
        charValues[0]  =  'H';
        
        for(int i=0;i < intValues.length;i++)
            intValues[i] = i+1;
 
        for(int i=0;i < intValues.length;i++)
        	System.out.println(intValues[i]);
        
	    //enhanced for
        for(int value:intValues)
            System.out.println(value);
        
        //initial array
        int[] oldArray = {1,2,3,4,5};
 
        //new value
        int newValue = 10;
 
        //define the new array
        int[] newArray = new int[oldArray.length + 1];
 
        //copy values into new array
        for(int i=0;i < oldArray.length;i++)
            newArray[i] = oldArray[i];
        //another solution is to use 
        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
 
        //add new value to the new array
        newArray[newArray.length-1] = newValue;
 
        //copy the address to the old reference 
        //the old array values will be deleted by the Garbage Collector
        oldArray = newArray;
        
        //display newArray
        System.out.println("newArray");
        for(int value:newArray)
            System.out.println(value);
        
        //display oldArray
        System.out.println("oldArray");
        for(int value:oldArray)
            System.out.println(value);
    }
}
