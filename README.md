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
Depending on the type if the Array has allocated memory and is called on might produce a 0 if it's an 
integer, or false if it's a boolean, or null.

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
