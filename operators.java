public class OperatorsDemo {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("\nRelational Operators:");
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));

        boolean x = true;
        boolean y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!x = " + (!x));

        int c = 12;
        int d = 7;
        System.out.println("\nBitwise Operators:");
        System.out.println("c & d = " + (c & d));
        System.out.println("c | d = " + (c | d));
        System.out.println("c ^ d = " + (c ^ d));
        System.out.println("~c = " + (~c));
        System.out.println("c << 2 = " + (c << 2));
        System.out.println("c >> 1 = " + (c >> 1));

        int e = 10;
        System.out.println("\nAssignment Operators:");
        e += 5;
        System.out.println("e += 5: " + e);
        e -= 3;
        System.out.println("e -= 3: " + e);
        e *= 2;
        System.out.println("e *= 2: " + e);
        e /= 4;
        System.out.println("e /= 4: " + e);
        e %= 3;
        System.out.println("e %= 3: " + e);

        int f = 5;
        System.out.println("\nUnary Operators:");
        System.out.println("f++ = " + (f++));
        System.out.println("++f = " + (++f));
        System.out.println("f-- = " + (f--));
        System.out.println("--f = " + (--f));

        int age = 18;
        String message = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println("\nTernary Operator:");
        System.out.println(message);
    }
}
