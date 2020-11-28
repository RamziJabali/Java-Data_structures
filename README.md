# Java-Data_structures
This repository will cover Java data structures

#1) Arrays

Arrays can contain primitives as well as object.
A Java array variable can also be declared like other variables with [] after the data type.
Java array can be also be used as a static field, a local variable or a method parameter.

```
 //DIFFERENT TYPES OF ARRAY DECLARATIONS
    int intArray1[];
    int[] intArray2;
```

```
 //DIFFERENT TYPES OF ARRAYS
    byte byteArray[];
    short shortsArray[];
    boolean booleanArray[];
    long longArray[];
    float floatArray[];
    double doubleArray[];
    char charArray[];
```
This Array declation below doesn't exist it, what it does is notify the compiler that the variable (intArray1) will hold an array of integers.
```
int intArray1[];
int[] intArray2;
```
Now to make variable intArray1 link to an actual Array you have to allocate it using the keyword `new` and assign it to intArray1
```
int intArray1 = new int[20];
//or
int intArray[];    //declaring array
intArray = new int[20];  // allocating memory to array

```
The elements in the array allocated by new will automatically be initialized to zero (for numeric types), false (for boolean), 
or null (for reference types).
Obtaining an array is a two-step process. First, you must declare a variable of the desired array type. 
Second, you must allocate the memory that will hold the array, using new, and assign it to the array variable. 
Thus, in Java all arrays are dynamically allocated.

To access/print the elements in the array you can do the following 

```
// accessing the elements of the specified array
for (int i = 0; i < arr.length; i++)
  System.out.println("Element at index " + i + 
                                " : "+ arr[i]);
                                
//For a 2-D array you can do this
//First box is the number of rows the second is the number of columns
 int testArray [][]= new int[4][3];
 for(int row = 0; row<testArray.length;row++){
            for(int column = 0; column<testArray[row].length; column++){
                System.out.print("["+testArray[row][column]+"]");
            }
            System.out.println("");
        }
//Result:
[0][0][0]
[0][0][0]
[0][0][0]
[0][0][0]
       
```


Arrays of Objects

An array of objects is created the sameway an array or primitives is 
```
ObjectName nameOfArray  [] = new ObjectName[2];
//example
Students studentNamesArray = new Student [20];//student is a user-defined class
```



