public class Main {
    public static void main(String[] args) {
        // generics = enable types ( classes and interfaces) to be parameters when defining:
        // classes, interfaces and methods.
        // A benefit is to eleiminate the need to create multiple versions of methods or classes for various data types
        // Use 1 version for all reference data types

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.5, 3.9, 4.8, 5.2, 2.7};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"B", "Y", "E"};

        //displayArray(intArray);
        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(stringArray));


    }
    public static <Thing> void displayArray(Thing[] array){ // I can see "Thing" as whatever type I want
        for (Thing x:array){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static<Thing> Thing getFirst(Thing[] array){ // we passed in this method an array of things
        return array[0];
        }


   /* public static void displayDouble (Double[] array){
        for(Double x: array){
          System.out.print(x+" ");
        }
        System.out.println();
    }
    // I can create a method for each data type

    */



}
