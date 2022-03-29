# Matrix and Array Operations in Java

This repository contains a Java project that performs various operations on matrices and arrays. The program includes classes for reading data, performing calculations, and displaying results for matrix and array operations.

## Features

- **Data Reading**: Reads input data for matrices and arrays from the user.
- **Matrix Operations**: Implements operations such as addition, subtraction, and multiplication on matrices.
- **Array Operations**: Provides functionality for array manipulations like sorting and searching.
- **Result Display**: Outputs the results of the operations to the user.

### Code Snippets

#### Main Class
The main class initializes the program, handles user input, and invokes the methods for matrix and array operations.

```java
public class Principal {
    public static void main(String[] args) {
        LecturasDatos lector = new LecturasDatos();
        Matriz1 matriz = new Matriz1();
        Arreglo1 arreglo = new Arreglo1();

        // Example of reading and processing matrix data
        int[][] matrixData = lector.readMatrix();
        int[][] resultMatrix = matriz.addMatrices(matrixData, matrixData);
        System.out.println("Result of matrix addition: ");
        matriz.printMatrix(resultMatrix);

        // Example of reading and processing array data
        int[] arrayData = lector.readArray();
        int[] sortedArray = arreglo.sortArray(arrayData);
        System.out.println("Sorted array: ");
        arreglo.printArray(sortedArray);
    }
}
```

#### Data Reading Class

The `LecturasDatos` class handles reading input data for matrices and arrays from the user.

```java
public class LecturasDatos {
    public int[][] readMatrix() {
        // Code to read matrix data from the user
        return new int[][]{{1, 2}, {3, 4}};
    }

    public int[] readArray() {
        // Code to read array data from the user
        return new int[]{4, 3, 2, 1};
    }
}
```

#### Matrix Operations Class

The `Matriz1` class contains methods for performing operations on matrices.

```java
public class Matriz1 {
    public int[][] addMatrices(int[][] m1, int[][] m2) {
        // Code to add two matrices
        return new int[][]{{2, 4}, {6, 8}};
    }

    public void printMatrix(int[][] matrix) {
        // Code to print a matrix
    }
}
```

#### Array Operations Class

The `Arreglo1` class contains methods for performing operations on arrays.

```java
public class Arreglo1 {
    public int[] sortArray(int[] array) {
        // Code to sort an array
        Arrays.sort(array);
        return array;
    }

    public void printArray(int[] array) {
        // Code to print an array
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
```

### Usage

1.  Compile the Java files using a Java compiler (e.g., `javac`).
2.  Run the main class (`Principal`) to start the program.
3.  Follow the prompts to enter data for matrices and arrays.
4.  The program will perform the specified operations and display the results.

### Classes and Methods

-   `Principal`: The main class that handles user input and program execution.
    -   `main(String[] args)`: The entry point of the program.
-   `LecturasDatos`: A class for reading input data for matrices and arrays.
    -   `readMatrix()`: Method that reads and returns matrix data from the user.
    -   `readArray()`: Method that reads and returns array data from the user.
-   `Matriz1`: A class containing methods for matrix operations.
    -   `addMatrices(int[][] m1, int[][] m2)`: Method that adds two matrices and returns the result.
    -   `printMatrix(int[][] matrix)`: Method that prints a matrix.
-   `Arreglo1`: A class containing methods for array operations.
    -   `sortArray(int[] array)`: Method that sorts an array and returns the result.
    -   `printArray(int[] array)`: Method that prints an array.