## Question 1

Suppose you are given a number n, and you want to determine the sum of all integers from 1 to n (inclusive) using recursion. Explain in English what the base case would be, and how you would reduce the problem size for the recursive call. Write pseudo-code that illustrates what the recursive function would look like, including what the inputs and output would be.

the base case, or the most trivial case as reffered to by Think like a Programmer, in this case would be if 0 or 1 is supplied to the function, for which it would just return 1 or 0.

```
recursiveFunction( n ){
    count = n
    if( n = 1 or n = 0){
        return n
    }
    count += recursiveFunction(n-1)
    return count
}

main(){

    sum = recursiveFunction(5)
    // sum would == 15
}
```

## Question 2

The ancient hero Achilles has an amazing power: he can cut the distance to his goal in half with only a single step. Also, he can take a normal step, which (for Achilles) covers 1 meter. Write pseudocode for a recursive function that counts how many steps Achilles will take to reach his goal, given an input distance in meters.

```

achillesStepCounter( distance ){
    steps = 0
    if(distance <= 2 ){
        return distance
    }
    steps +=  1 + achillesStepCounter(distance / 2 )
    return steps
}

```
