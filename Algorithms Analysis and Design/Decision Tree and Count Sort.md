## Decision-tree Model

### Idea

- It's a tree that can model comparison-based sorting algorithms.
- The running time of such an algorithm can be determined by the length of the path taken.
- Worst-case running time can be the height of the tree which is **Ω** (h)
- This model is also known as the comparison model.

### Proof 

**Leaves must be >= n!**

Because there n! permutations of the input and each permutation must be detected.

Consider a tree of height (h), the maximum number of leaves is at most 2^h because it's a binary tree.

![decision_tree_analysis](screenshots\decision_tree_analysis.png)

## Sorting In Linear Time

### Counting Sort

- Counting occurrences of positive Integers in the array.

#### *Algorithm*

Input: Array A

Count Array => count occurrences of elements in array A from 0 to K-1 where K equal to ....

- Initialize Count Array to Zeros..
- 

#### *Implementation*



