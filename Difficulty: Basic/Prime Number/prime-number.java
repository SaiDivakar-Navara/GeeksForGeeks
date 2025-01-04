//{ Driver Code Starts


import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine()); // Read number of test cases

        while (t-- > 0) {
            int n =
                Integer.parseInt(read.readLine()); // Read the number to check primality
            Solution ob = new Solution();
            if (ob.isPrime(n)) {
                System.out.println("true"); // If the number is prime, print "true"
            } else {
                System.out.println(
                    "false"); // If the number is not prime, print "false"
            }
            System.out.println("~"); // If the number is not prime, print "false"
        }
    }
}

// } Driver Code Ends



class Solution {
    static boolean isPrime(int n) {
        // code here
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}