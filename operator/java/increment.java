package operator.java;

public class increment {
    public static void main(String args[]) {
        // int a = 7;
        // a++; // increment
        // System.out.println(a);
        // a--; // decrement
        // System.out.println(a);
        int a = 5;
        // int b = a++;// post increment
        // int b = ++a; // pre increment
        // int b = a++ + ++a + --a;
        int b = a++ + ++a + ++a + a++ + --a + a--;//
        System.out.println(a);
        System.out.println(b);
    }
}

