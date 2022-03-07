import java.util.Scanner;

class BinarySearchGuessingGame {
    //print numbers guessed before finding the secret value. BST style searching.
    public static void main(String[] args) {
        System.out.println("welcome\n This program prints the values before it finds the key between high and low using binary search methods");
        Scanner in = new Scanner(System.in);
        int low, high, secretValue, temp;

        Scanner input = new Scanner(System.in);
        System.out.println("enter low: ");
        low = input.nextInt();
        System.out.println("enter high: ");
        high = input.nextInt();
        System.out.println("enter secret: ");
        secretValue = input.nextInt();

        if (low > high) {
            temp = low;
            low = high;
            high = temp;
        }
        Guess(low, high, secretValue);
    }

    public static void Guess(int low, int high, int secretValue) {
        int mid = (low + high) / 2;
        System.out.print(mid + " ");
        if (mid == secretValue) {
            return;
        }

        if (secretValue > mid) {
            Guess(mid + 1, high, secretValue);


        }
        if (secretValue < mid) {
            Guess(low, mid - 1, secretValue);
        }


    }
}