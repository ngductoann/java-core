public class JavaPrimitiveType {
    public static void main(String[] args) {
        int myVariable = 10000; // int keyword define for Integer type
        System.out.println(myVariable);

        int myMinIntValue = Integer.MIN_VALUE; // minimum value in data type Integer.
        System.out.println(myMinIntValue);

        int myMaxIntValue = Integer.MAX_VALUE; // maximum value in data type Integer.
        System.out.println(myMaxIntValue);

        System.out.println("Integer Value Range (" + myMinIntValue + " to " + myMaxIntValue + ")");
        // Integer Value Range (-2147483648 to 2147483647)

        System.out.println("Busted Max value = " + (myMaxIntValue + 1));
        // Busted Max value = -2147483648

        System.out.println("Busted Min value = " + (myMinIntValue - 1));
        // Busted Min value = 2147483647

        System.out.println("Integer Value Range (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")");
        System.out.println("Byte Value Range (" + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ")");
        System.out.println("Short Value Range (" + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ")");

        long myLongValue = 100l; // 100L
        System.out.println(myLongValue);

        System.out.println("A long has a width of " + Long.SIZE);

        System.out.println("Long value range (" + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ")");

        long bigLongLiteralValue = 2_147_483_647; // correct

        // long bigLongLiteralValue = 2_147_483_647_234; //error integer number too large
    }
}
