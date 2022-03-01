public class Overloaded_meth {
    public static void main(String[] args) {
        // = share the same name but have different parameters
        // method name + parameters = method signature;
     double x = add(1.2,0.2);
        System.out.println(x);
    }

    static int add(int a, int b){ // overloaded method #1
        return a+b;
    }

    static int add( int a, int b, int c){ // overloaded method #2
        return a+b+c;
    }

    static int add( int a, int b, int c, int d){ // overloaded method #3
        return a+b+c+d;
    }

    static double add(double a, double b){ // overloaded method #4
        return a+b;
    }

    static double add( double a, double b, double c){ // overloaded method #5
        return a+b+c;
    }
}
