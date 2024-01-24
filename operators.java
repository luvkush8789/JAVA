// import java.util.*;

// public class operators {
//     public static void main(String[] args) {
//         // Arithmetic operators
//         // int A = 40;
//         // int B = 50;
//         // System.out.println("sum of A & b is : " + (A + B));
//         // System.out.println("difference of A & b is : " + (B - A));
//         // System.out.println("product of A & b is : " + (A * B));
//         // System.out.println("division of A & b is : " + (A / B));
//         // System.out.println("remainder of A & b is : " + (A % B));

//         // Unary operators
//         // pre increment
//         // int a = 10;
//         // int b = ++a;
//         // System.out.println(a);
//         // System.out.println(b);
//         // post increment
//         // int a = 10;
//         // int b = a++;
//         // System.out.println(a);
//         // System.out.println(b);

//         // Relational Operators

//         // int A = 10;
//         // int B = 10;
//         // System.out.println(A == B);

//         // Logical Operators
//         // Logical AND
//         System.out.println((5 < 2) && (10 < 5));

//     }

// }

// Operators Exercise

import java.util.*;

public class operators {
    public static void main(String[] args) {
        // int x = 2;
        // int y = 5;
        // int exp1 = (x * y / x);
        // int exp2 = (x * (y / x));
        // System.out.println(exp1 );
        // System.out.println(exp2);

        // int x = 200;
        // int y = 50;
        // int z = 100;
        // if (x > y && y > z) {
        //     System.out.println("Hello");
        // }
        // if (z > y && z < x) {
        //     System.out.println("java");

        // }

        // if ((y + 200) < x && (y + 150) < z) {
        //     System.out.println("Hello Java");
        // }

        int x, y, z;
        x = y = z = 2;
        x += y;
        y -= z;
        z /= (x + y);
        System.out.println(x + " " + y + " " + z);

    }
}
