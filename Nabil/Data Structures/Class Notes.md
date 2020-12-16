[TOC]

## Red Black Tree

- Each node is either red or black.
- The root is black. This rule is sometimes omitted. Since the root  can always be changed from red to black, but not necessarily vice versa, this rule has little effect on analysis.
- All leaves (NIL) are black.
- If a node is red, then both its children are black.
- Every [path](https://en.wikipedia.org/wiki/Path_(graph_theory)) from a given node to any of its descendant NIL nodes goes through the same number of black nodes.

#### Rotation Rules

- L,L: Right
- R,L: Right
- R,R: Left
- L,R: Left

#### Insertion

1. If tree is **empty**, create initial root as black node
2. If tree is **not empty**, create node as **red** using balanced BST rules
3. If **parent** of new node is **black** nothing needs to happen
4. Otherwise check **parent's sibling colour**
   1. If it's **black** or **null** then do suitable rotation and recolour
   2. If it's red then **recolour** it to black and also **check if parent's parent of new node is not root** then recolour it and check again

## 2-3 Trees

- Each internal node has 2-3 children
- Each node has 1 or 2 keys
- All leaves on same level
- #keys in each internal node = #children - 1 
- The keys in each node are ascending
- The keys in first `i` children of an internal node are smaller than its `i^th`   key, while the keys remaining in children are larger

#### Insertion

- Insert new key to suitable spot to keep tree sorted
- If leaf has 3 keys split it into two leaves
  - One contains the smallest
  - The other contains the largest
  - The middle is moved to parent
  - If parent has 3 keys now, repeat steps on that parent

#### Deletion 

- If deleting from leaf and leaf is empty after deletion
  - If its has a sibling leaf with 2 keys 
    - One of them is moved to parent
    - In-between key in parent is moved to the empty leaf
  - If it has a sibling leaf with 1 key
    - Merge along the in-between key from parent into one leaf
    - If parent becomes empty, repeat unless root just delete it
- If deleting from internal node
  - The key to be deleted is replaced with its immediate predecessor or successor, which can only exist in a leaf, then repeat deleting from leaf procedure



## B-Tree

- The root has between `1` and `m-1` keys
- Every internal node (except root) has between `⌈m/2⌉` and `m` children
- #keys in each internal node = #children - 1
- All leaves appear in the same level
- The keys in first `i` children of an internal node are smaller than its `i^th`   key, while the keys remaining in children are larger
- Commonly used in [databases](https://en.wikipedia.org/wiki/Database) and [file systems](https://en.wikipedia.org/wiki/File_system)

#### Insertion

- Insert new key to suitable spot to keep tree sorted
- If leaf has m keys split it into two leaves
  - One contains half the values
  - The other contains the rest
  - The middle is moved to parent
  - If parent has 3 keys now, repeat steps on that parent

#### Deletion 

- If deleting from leaf and leaf contains `⌈m/2⌉ - 2` keys after deletion
  - If its has a sibling leaf with `>= ⌈m/2⌉` keys
    - Merge along the in-between key from parent into one leaf
    - Move middle key to parent
    - Remaining keys split over 2 leaves
  - If its has a sibling leaf with `⌈m/2⌉ - 1` keys
    - Merge along the in-between key from parent into one leaf
    - If parent has `⌈m/2⌉ - 2`, repeat unless it's not root
- If deleting from internal node
  - The key to be deleted is replaced with its immediate predecessor or successor, which can only exist in a leaf, then repeat deleting from leaf procedure

## B+ Trees

- A B-tree where all keys exist in leaves
- Keys in intermediate internal nodes are used for directing search queries only
- Additional links exist from each leaf to its right sibling to facilitate range queries (especially for secondary storage) 
- Once a query reaches a leaf, all subsequent records can be accessed without having to access nodes at higher levels

#### Static B+ Trees

- Multi-level indexing
- If no updates are required then data can be sorted to construct the deepest B+ tree level
- Higher levels are the constructed statically
- All links substituted with formulas as functions of a fixed node size

## Tries

- A tree data structure
- Stores several small strings (*dataset*)
- Allows to search and retrieve a query inside that *dataset*
- Each edge is labelled with one character
- Each *dataset* is given an ID and contained in the last node of a *dataset*
- Suitable for perfect auto-complete [must start word with correct symbol]

#### Example

![trie](http://www.allisons.org/ll/AlgDS/Tree/PICS/trie.gif)

#### Insertions and retrievals

- Start at the root
- Cost at most O(m) time, assuming each node takes O(1), where m is query string length

#### Structure

- Each node contains **array** of length N, each element points to a child node character. Each node requires requires **O(1)** time and **O(|Z|)** space
- Each node contains a **linked list** where each element contains a **character** and a **child node pointer**. Each node requires requires **O(|Z|)** time and **O(1)** space
- Each node contains a **red-black-tree** where each element contains a **character as the key** and a **child node pointer**. Each node requires **O(log(|Z|))** time and **O(1)** space
- One **hash table** for the whole trie where each element contains a **character** and **two node pointers**: parent and child. The hash function is a **function** of the parent node pointer and the character. Each node requires **O(1)** time and **O(1)** space, but suffer cache misses

## Suffix Tries

- A trie that stores all suffixes of a string (often large) 
- A suffix is a substring that ends at n - 1
- The suffix ID is where it starts, can't use the ending location since all suffixes end at the same location
- Requires O(n^2) space and construction time, making it *impractical*
- Requires a sentinel node to make it practical
- Suffix IDs can be deduced after query traversal by `n - #traversed`
- More suitable for **faulty** auto-complete ["application" without the first letter]

## Suffix Trees

- A compact suffix trie including **sentinel** nodes
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