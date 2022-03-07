public class Steps {
    int[] memo;
    public static void main(String[] args) {

    }
    int fib(int n){
        if (n==0){

            return 1;

        }
        if (n==1){
            return 1;
        }

        if (memo[n] > 0){return memo[n];}
        int result = fib(n-1) + fib(n-2);

          return result;
    }
}
