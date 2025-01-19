public class Casting_in_Java {
    public static void main(String[] args) {
        // Rule for declaring multiple variables in one statement

        // Correct declare variable
        short myMinShortValue = Short.MIN_VALUE;
        int myMinIntValue = Integer.MIN_VALUE;

        byte myMinByteValue = Byte.MIN_VALUE, myMaxByteValue = Byte.MAX_VALUE;

        // Error declare
        /**
         * short firstShort = 1, int firstInteger = 2;
         * byte firstByte = 1, byte secondByte = 2;
         * error because use comma to split different variable
         **/

        int myTotal = (myMinByteValue / 2);

        // byte myTotal2 = (myMinByteValue / 2); //error
        byte myTotal2 = (byte) (myMinByteValue / 2); // correct
    }
}
