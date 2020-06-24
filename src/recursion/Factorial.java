package recursion;

public class Factorial {

    /* Iterative Solution
        5! => 1 * 2 => 2 * 3 => 6 * 4 => 24 * 5 => 120
    */

    public int iterFact(int n){
        int m = 1;
        for (int i = 1; i < n; i++) {
            m = m * (i+1);
        }
        return m;
    }

    /* Recursive Solution
        5!
        5 * 4!
        5 * 4 * 3! ...
        5 * 4 * 3 * 2 * 1
    */

    public int recFact(int n){
        if (n == 1) return 1;
        else return n = n * recFact(n-1);
    }
}


