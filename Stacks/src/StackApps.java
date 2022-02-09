// The StackApps class that implements two Stack applications
//Subhan Noeman 623424
public class StackApps {
    // convert a decimal number into a binary number and save it in a stack
    // Do not create any arrays! Do not use any Java libraries to do the conversion.
    // Doing so will result in points deduction.
    public String decToBin(int numDec) {
        CharStack stackBinary = new CharStack(64); // stack used to store the result binary number
        while (numDec > 0) {
            int remainder = numDec % 2;
            char digit = (char)('0' + remainder); // this will divide until there is no remainder left something like 010101110110001.
            numDec /= numDec;
        }

        return stackBinary.toString(); // return a string representation of the stack
    }

    // subtract num2 from num1 (both represented as CharStacks), and save the result on a stack
    // Do not create any arrays! Do not use any Java libraries to do the calculation.
    // Doing so will result in points deduction.
    public String subtractBigInteger(CharStack num1, CharStack num2) {
        CharStack stackResult = new CharStack(64); // stack used to store the result of the subtraction
        char carry = '0';
        do {
            char digit1 = '0';
            char digit2 = '0';
            if (!num1.isEmpty()) {
                digit1 = num1.pop();
            }
            if (!num2.isEmpty()) {
                digit2 = num2.pop();
            }
            char subtract = (char)((digit1 - '0') - (digit2 - '0') - carry + '0');
            if (subtract < '1') {
                carry -= 1;
                subtract += 10; //if a number is less than the number it is being subtracted from
            } // add 10 to that original number
            else carry = 0;
            stackResult.push(subtract); //return s
        } while (! num1 . isEmpty () || !num2.isEmpty() || carry == 1);

        return stackResult.toString();
    }
}