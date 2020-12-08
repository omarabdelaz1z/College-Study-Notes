[TOC]

## Tries

- A tree data structure
- Stores several small strings (*dataset*)
- Allows to search and retrieve a query inside that *dataset*
- Each edge is labelled with one character
- Each *dataset* is given an ID and contained in the last node of a *dataset*

#### Insertions and retrievals

- Start at the root
- Cost at most O(m) time, assuming each node takes O(1), where m is query string length

#### Structure

- Each node is contains array of length N, each element points to a child node character. Each node requires 

## Suffix Tries

- A trie that stores all suffixes of a string (often large) 
- A suffix is a substring that ends at n - 1
- The suffix ID is where it starts, can't use the ending location since all suffixes end at the same location
- Requires O(n^2) space and construction time, making it *impractical*

## Suffix Trees

- A compact suffix trie including the $
- Doesn't contain any one-child nodes
- All suffixes end at *leaves*
- Doesn't contain permutations of the dataset itself, but rather `[start location, length]` pairs to avoid O(n^2) space
- *Ukkonen* proposed an algorithm to construct in only **O(n) space and time**
- Search complexity is O(m + occ), m is length of query, `occ` is number of occurrences of that string in the tree
- Can also store the `start location` only. 
  - To deduce the length of a permutation you can 
    - subtract the smallest `start location` of children from the start location of a parent, 
    - or the `start location` of child from the `length of string - 1`



>  Characters labels are just for explanation purposes, they're not actually included in the trees themselves.

#### Theory

The number of internal nodes with no one-child nodes <= number of leaves - 1

###### Proof