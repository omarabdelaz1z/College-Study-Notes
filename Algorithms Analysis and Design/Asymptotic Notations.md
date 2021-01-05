## Asymptotic Notations

<img src="https://render.githubusercontent.com/render/math?math=1 < log(n) < sqrt(n) < n < n*logn < n^2 < n^3 < 2^n < 3^n < n! < n^n">


### Upper Bound - Big O
- Notation: **F(n) = O(G(n))** 

- A function F(n) is upper-bounded by G(n) such that 

<img src="https://render.githubusercontent.com/render/math?math=F(n) <= c * G(n)">

- Note: write the G(n) that is closest to F(n)
### Lower Bound - Big Omega
- Notation: **F(n)= Ω(G(n))**

- A function F(n) is lower-bounded by G(n) such that
<img src="https://render.githubusercontent.com/render/math?math=F(n) >= c * G(n)">

### Average Bound - Theta
- Notation: **F(n) = Θ(G(n))**

- A function F(n) is bounded by G(n) such that it can be sandwiched between
<img src="https://render.githubusercontent.com/render/math?math=0 ≤ c1g(n) ≤ f(n) ≤ c2g(n)">

Note: c, c1, c2 are all positive constants.

## Asymptotic Notations Properties

#### Reflexivity 

```
if f(n) is given then:
    f(n) = O(f(n)) 
    f(n) = Ω(f(n)) 
    f(n) = Θ(f(n))
```

#### Symmetry

  f(n) = Θ(g(n)) if and only if g(n) = Θ(f(n))

  example:
      f(n) = n^2 
      g(n) = n^2
      then f(n) = Θ(n2) and g(n) = Θ(n2)

#### Transitivity

  f(n) = O(g(n)) and g(n) = O(h(n)) ⇒ f(n) = O(h(n))
  example:
      f(n) = n 
      g(n) = n^2 
      h(n) = n^3
      
  	n is O(n^2) 
      n^2 is O(n^3)
  then 
      n is O(n^3)
#### Transpose Symmetry

  f(n) = O(g(n)) if and only if g(n) = Ω(f(n))

  - If f(n) = n and g(n) = n2 then n is O(n2) and n2 is Ω(n)
## Logarithmic Rules

<img src="https://render.githubusercontent.com/render/math?math=log(a*b) = log(a) + log(b)">
<img src="https://render.githubusercontent.com/render/math?math=log(a/b) = log(a)-log(b)">
<img src="https://render.githubusercontent.com/render/math?math=log(a^b) = b * log(a)">
<img src="https://render.githubusercontent.com/render/math?math=a^{\log _c\left(b\right)} = b^{\log _c\left(a\right)">
<img src="https://render.githubusercontent.com/render/math?math=a^b = n">
<img src="https://render.githubusercontent.com/render/math?math=(\log _a\left(n\right) = b">


## Some Arithmetic Rules

![sum_from_1_to_n](screenshots/sum_from_1_to_n.png)

![Series](screenshots/series.png)

## Recurrences

### Substitution Method

#### [Explanation](https://youtu.be/jz1GQ4wJcYA)

#### Steps

- Guess a solution.
  - T(n) = O(g(n))

- Use induction to prove that the solution works.
  - Simple Case.
  - Induction hypothesis. Relation is valid at k where T(k) <= c * g(k)
  - induction goal (apply the definition of the asymptotic notation)

#### Examples

### Iterative Method

- [Plug-and-chug by John Bowers](https://youtu.be/Ob8SM0fz6p0)

### Recursion Tree

- [Recurrence Tree by John Bowers](https://youtu.be/sLNPd_nPGIc)

### Master Method

- The master method applies to recurrences of the form

<img src="https://render.githubusercontent.com/render/math?math=T(n) = a * T(n/b) + f(n)">

​	where a >=1, b > 1 and f(n) > 0

#### Case 1


<img src="https://render.githubusercontent.com/render/math?math=∵ n^{\log _b\left(a\right)} > f(n)">

<img src="https://render.githubusercontent.com/render/math?math=∴ T(n) = Θ(n^{\log _b\left(a\right)}))">

#### Case 2


<img src="https://render.githubusercontent.com/render/math?math=n^{\log _b\left(a\right)} = f(n)))">
<img src="https://render.githubusercontent.com/render/math?math=∴ T(n) = Θ(n^{\log _b\left(a\right)}*log(n)))">


#### Case 3

Regularity condition must be met

Condition: a * f(n/b) <= c * f(n) for some c < 1

<img src="https://render.githubusercontent.com/render/math?math=∵ n^{\log _b\left(a\right)} < f(n)">
<img src="https://render.githubusercontent.com/render/math?math=∴ T(n) = Θ(f(n)">

#### Steps

1. Compute a, b, f(n), and c, where  logb(a) {log a base b}
2. Get n^(logb(a))
3. Compare (2) with f(n)
4. Determine the appropriate case

#### Examples

![image-20201209024459593](screenshots/master-examples-1.png)

![image-20201209031319096](screenshots/master-examples-2.png)

## Common Recurrence Relations

### Binary Search

![binary_search_rr](screenshots/binary_search_rr.PNG)

### Merge Sort

![mergesort_rr](screenshots/mergesort_rr.PNG)

### Powering a Number

![powering-number](screenshots/powering-number.PNG)

	##### Formula

<img src="https://render.githubusercontent.com/render/math?math=a^n = a^{n/2} * a^{n/2}">
<img src="https://render.githubusercontent.com/render/math?math=a^n = a^{n-1/2} * a^{n-1/2} * a">


### Fibonacci Numbers

#### Naïve Solution

<img src="https://render.githubusercontent.com/render/math?math=F(n) = F(n-1) +F(n-2)">

F(n) = n for n = 0 or n = 1

Exponential Time: Golden ratio power n
<img src="https://render.githubusercontent.com/render/math?math=Ω((1+sqrt(5))/2)^n)">

#### Recursive Squaring

![image-20201209142351899](screenshots/recursive_squaring_theorem.png)

Assume n = 2.

![image-20201209142647295](screenshots/proving.png)

### Matrix Multiplication

#### Naïve Solution

![image-20201209143326135](screenshots/matrix-multiplication.png)

#### DC Algorithm

![image-20201209144118308](screenshots/mp_dc.png)

T(n) = 8T(n/2) + Θ(n^2)

T(n) = Θ(n^3)

#### Strassen Algorithm

This algorithm reduces the number of multiplication from 8 to 7 (:d)

![image-20201209144311058](screenshots/stressen.png)
