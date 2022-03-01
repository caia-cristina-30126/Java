public class Printf_meth {
    public static void main(String[] args) {
        // 2 argumants: format string + (object/variable/value);
        System.out.printf("The string %d", 123);
        System.out.println();
        System.out.printf("%d The other string ", 123);

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Cris";
        int myInt = 50;
        double myDouble = 1000;
        System.out.println();

       // [conversion - character]
        System.out.printf("%b", myBoolean);
        System.out.printf("%c", myChar);
        System.out.printf("%s", myString);
        System.out.printf("%d", myInt);
        System.out.printf("%f", myDouble);

        // [width] = min no of characters to be written as output
        System.out.printf("Hello %10s", myString);
        //or
        System.out.printf("Hello %-10s", myString);

        //[precision] = sets number of digits of precision when outputting floating-point values
        System.out.printf("you have this much money %,f", myDouble);

        // [flags]
        // adds an effect to output baseed on the flag added to format specifier
        // - : left-justify;
        // + : output a plus or minus sign for a numeric value;
        // 0 : numeric values are zero-padded;
        // , : comma grouping separator if numbers > 1000


        System.out.println();
        // final key : you cannot change it;
        final double pi = 3.14159;
        System.out.println(pi);
    }
}
