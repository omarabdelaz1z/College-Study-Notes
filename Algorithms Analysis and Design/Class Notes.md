## Things more important than performance

- modularity
- correctness
- maintainability
- functionality
- robustness
- user-friendliness
- programmer time
- simplicity
- extensibility
- reliability

## Order
- Functions such as `5n^2` and `3n^4 + 100` are *pure* quadratic
- Functions such as `5n^2 + n + 100` are complete quadratic because they contain a linear term `n`

## Asymptotic Notations

- Big O
- Big Theta 
- Big Omega

#### **O Notation** (upper bounds)

O-notation is an upper-bound notation used to identify the **worst case** of an algorithm. It makes **no** sense to say `f(n)` is at least `O(n^2)`.

###### Convention

A set in a formula represents an anonymous function in the set.

`f(n) = n3+ O(n^2)` means `f(n) = n3+ h(n)` for some `h(n) ∈ O(n2)`

`n^2 + O(n) = O(n^2)` means for any `f(n) ∈ O(n): n2 + f(n) = h(n)` for some `h(n) ∈ O(n^2)`.

#### Ω Notation (lower bounds)

Ω-notation is a lower-bound notation used to identify the **best case** of an algorithm. It **does** make sense to say `f(n)` is at least `O(n^2)`.

#### θ Notation (tight bounds)

Big Theta is either the exact performance value of the algorithm, or a useful **range** between **narrow** upper and lower bounds.

>  "The delivery will be there within your lifetime."

Everything that is `Theta(f(n))` is also `O(f(n))` , but not the other way around. For this reason **big**-**Theta** is more informative than **big**-**O** notation.

![Big-θ (Big-Theta) notation (article) | Khan Academy](https://cdn.kastatic.org/googleusercontent/-wifqTWyEEUOT_GdHeDafyyALYYDLagxRL5N6Sb5UjUWfeU4UjF7b8_7fcLBUYVc-0fNKpr4Cf3jFdbRWjAHO_RQ)

#### ο-notation and ω-notation (small o, small omega)

- O-notation and Ω-notation are like `≤` and `≥`.

- o-notation and ω-notation are like `<` and `>`.

## Solving Recurrences 

- Substitution method
- Tree method
- Master theorem

#### Substitution Method

1. Build a solution
2. Expand
3. Repeat until a pattern shows up
4. Solve with T(1)

###### Example

Prove that `T(n) = 2T(n/2) + 4n` => `O(n log n)`

Solution: [(Plug-and-chug) Method](https://youtu.be/Ob8SM0fz6p0)

Do not replace 2^2 with 4, keep powers as n^k to help notice patterns.

#### Tree Method

1. Split the page into 4 sections (recursive calls, #nodes, tree, row sum)
2. Keep expanding until you can notice a pattern
3. Turn `#nodes` pattern into an `i` variable
4. Get sums of each row `Sigma`
5. Substitute `T(1)` into `i` into the sum equation

###### Example

Prove that `T(n) = 2T(n/2) + 4n` => `O(n log n)`

Solution: [Recurrence Tree](https://www.youtube.com/watch?v=sLNPd_nPGIc)

Do not replace 2^2 with 4, keep powers as n^k to help notice patterns.

#### Master Method

Works only on recurrences with the formula `T(n) = a T(n / b) + f(n)` where:

- `a >= 1` 
- `b > 1` 
- `n` is the size of the problem
- `n/b` is the size of each subproblem
- `p` is the cost of work outside the recursive calls (the magnitude) of the `f(n)`

Applies to a few cases only:

- `p = Theta(n^p), p < logb(a)` then `T(n) = Theta(n^logb(a))`
- `f(n)= Theta(n^p), p = logb(a)` then `T(n) = Theta (n^(p) logn)`
- `f(n)= Theta(n^p), p > logb(a)` then `T(n) = Theta (f(n))`

Steps:

1. Extract a, b, p
2. Determine case
3. Solve

## The Divide and Conquer Paradigm

1. Divide the problem into subproblems
2. Conquer each subproblem on its own
3. Merge all subproblem solutions

Algorithms based on it include:

- Merge Sort
- Binary Search
- Powering a number
- Fibonacci
- Recursive squaring
- Matrix multiplication
- VLSI layouts & H-tree embedding

#### Merge Sort

1. Divide the input array into single-element arrays
2. Recursively compare and merge arrays into bigger ones
3. Combine all solutions into a single final array

> T(n) = 2T(n/2) + Θ(n)

###### Finding its complexity

Applying Master theorem

```
a = 2
b = 2
f(n) = Theta(n^1) then p = 1
logb(a) = 1 = p then second case
finally T(n) = Theta(n logn)
```

#### Binary Search

1. Check middle element and divide
2. Recursively search the subarray less than the middle element
3. Find value you're searching for and finish/merge