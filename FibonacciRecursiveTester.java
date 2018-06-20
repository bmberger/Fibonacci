/**
 * This class tests and creates the recursive method for
 * Fibonacci numbers.
 *
 * @author Briana Berger
 * @version 05/17/18
 */

import java.util.Scanner;
class FibonacciRecursive
{
    FibonacciRecursive()          // default constructor
    {
    }

    /**
     * The purpose of the method is to create a recursive method for Fibonacci numbers.
     * @param n - type is int
     * @return value of each n
     */
    public int fib(int n)
    {
        if(n == 0 || n == 1)
        {
            return n;
        }
        else
        {
            return fib(n-1) + fib(n-2);
        }
    }
}

//tester class of the fib method and getting the user's input on n.
public class FibonacciRecursiveTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        FibonacciRecursive rMethods = new FibonacciRecursive();

        System.out.print("What n do you want for the Fibonacci number? ");
        int nNumber = input.nextInt();
        if (nNumber < 0)
        {
            System.out.println("Invalid n entered.");
            return;
        }

        // Call fib with an n value
        System.out.println("Fibonacci number of n = " + nNumber + ": " + rMethods.fib(nNumber));
        System.out.println();

    }
}
