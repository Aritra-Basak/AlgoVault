# DSA Interview Practice Sheet — Product & Banking Companies

A topic-wise list of questions that come up again and again in DSA rounds at:

- **Product companies:** Amazon, Microsoft, Google, Adobe, Atlassian, Flipkart, Uber, Walmart, Salesforce, Intuit, PhonePe, Swiggy, etc.
- **Banking / FinTech:** Goldman Sachs, JPMorgan Chase, Morgan Stanley, Deutsche Bank, Barclays, Wells Fargo, Citi, American Express, Visa, Mastercard, etc.

**Legend**
- `E` / `M` / `H` = Easy / Medium / Hard
- `LC #` = LeetCode problem number. `GfG` = GeeksforGeeks.
- **[P]** = asked a lot at product companies, **[B]** = asked a lot at banks / fintech
- ✅ = there's already a solution in this repo (`DSA_Vault_2k25/src`)
- Tick `[x]` as you finish each one.

> **How banking rounds differ:** Goldman Sachs and Morgan Stanley ask questions about as hard as product companies (Medium–Hard, often DP, graphs and math). JPMorgan, Barclays, Wells Fargo, Citi and Deutsche Bank mostly ask Easy–Medium array, string, hashing, linked list and stack questions, plus **Java/OOP, SQL and some puzzles**. Prepare all three.

---

## 1. Arrays

- [x] ✅ Two Sum — LC 1 — E [P][B]
- [x] ✅ Best Time to Buy and Sell Stock — LC 121 — E [P][B]
- [ ] Best Time to Buy and Sell Stock II / III / IV — LC 122 / 123 / 188 — M/H [B]
- [x] ✅ Contains Duplicate — LC 217 — E
- [x] ✅ Maximum Subarray (Kadane's algorithm) — LC 53 — M [P][B]
- [x] ✅ Maximum Product Subarray — LC 152 — M [P]
- [ ] Product of Array Except Self — LC 238 — M [P][B]
- [x] ✅ Sort Colors (0s, 1s, 2s / Dutch National Flag) — LC 75 — M [B]
- [x] ✅ Move Zeroes — LC 283 — E
- [x] ✅ Set Matrix Zeroes — LC 73 — M
- [ ] Rotate Image (matrix by 90°) — LC 48 — M [P][B]
- [ ] Spiral Matrix — LC 54 — M [P][B]
- [x] ✅ Pascal's Triangle — LC 118 — E
- [ ] Next Permutation — LC 31 — M [P]
- [ ] Majority Element (Moore's Voting) — LC 169 — E [B]
- [ ] Majority Element II — LC 229 — M
- [ ] Merge Intervals — LC 56 — M [P][B]
- [ ] Insert Interval — LC 57 — M
- [ ] Non-overlapping Intervals — LC 435 — M
- [ ] Merge Sorted Array (without extra space) — LC 88 — E [B]
- [ ] Rotate Array by k — LC 189 — M [B]
- [ ] Leaders in an Array — GfG — E [B]
- [x] ✅ Find the Duplicate Number — LC 287 — M [P]
- [x] ✅ Missing Number / Find All Missing — LC 268 / 448 — E
- [x] ✅ Find Missing and Repeating — GfG — M [B]
- [x] ✅ Second Largest Element — GfG — E [B]
- [x] ✅ Plus One — LC 66 — E
- [x] ✅ Longest Consecutive Sequence — LC 128 — M [P]
- [ ] First Missing Positive — LC 41 — H [P]
- [ ] Count Inversions (using merge sort) — GfG — M [B]
- [ ] Reverse Pairs — LC 493 — H

## 2. Prefix Sum & Hashing

- [x] ✅ Prefix Sum Array — basic
- [ ] Subarray Sum Equals K — LC 560 — M [P][B]
- [ ] Longest Subarray with Sum K (positives / with negatives) — GfG — M [B]
- [x] ✅ Count Subarrays with XOR K — GfG — M
- [ ] Subarray Sums Divisible by K — LC 974 — M
- [ ] Contiguous Array (equal 0s and 1s) — LC 525 — M
- [ ] Range Sum Query 2D — LC 304 — M
- [ ] Group Anagrams — LC 49 — M [P][B]
- [ ] Valid Anagram — LC 242 — E [B]
- [x] ✅ Top K Frequent Elements — LC 347 — M [P]
- [ ] Isomorphic Strings — LC 205 — E
- [ ] Design HashMap — LC 706 — E [B]

## 3. Two Pointers

- [x] ✅ Two Sum II (sorted array) — LC 167 — M
- [x] ✅ 3Sum — LC 15 — M [P][B]
- [ ] 4Sum — LC 18 — M
- [ ] 3Sum Closest — LC 16 — M
- [ ] Container With Most Water — LC 11 — M [P][B]
- [x] ✅ Trapping Rain Water — LC 42 — H [P][B]
- [x] ✅ Valid Palindrome — LC 125 — E
- [ ] Remove Duplicates from Sorted Array — LC 26 — E [B]
- [x] ✅ K-diff Pairs in an Array — LC 532 — M
- [ ] Squares of a Sorted Array — LC 977 — E

## 4. Sliding Window

- [x] ✅ Maximum Sum Subarray of Size K — GfG — E
- [x] ✅ Longest Substring Without Repeating Characters — LC 3 — M [P][B]
- [ ] Longest Repeating Character Replacement — LC 424 — M [P]
- [ ] Minimum Window Substring — LC 76 — H [P]
- [ ] Permutation in String — LC 567 — M
- [ ] Find All Anagrams in a String — LC 438 — M
- [ ] Sliding Window Maximum — LC 239 — H [P][B]
- [ ] Max Consecutive Ones III — LC 1004 — M
- [ ] Fruit Into Baskets — LC 904 — M
- [ ] Minimum Size Subarray Sum — LC 209 — M
- [ ] Subarrays with K Different Integers — LC 992 — H
- [ ] First Negative Number in Every Window of Size K — GfG — E [B]

## 5. Binary Search

- [x] ✅ Binary Search / Order-agnostic / Floor / Ceil — basics
- [x] ✅ First and Last Position of Element — LC 34 — M [P][B]
- [x] ✅ Search in Rotated Sorted Array — LC 33 — M [P][B]
- [ ] Search in Rotated Sorted Array II — LC 81 — M
- [x] ✅ Find Minimum in Rotated Sorted Array — LC 153 — M
- [x] ✅ Find Peak Element — LC 162 — M
- [x] ✅ Find Smallest Letter Greater Than Target — LC 744 — E
- [x] ✅ Search a 2D Matrix — LC 74 / 240 — M
- [x] ✅ Koko Eating Bananas — LC 875 — M [P]
- [x] ✅ Nth Root of a Number — GfG — M
- [x] ✅ Median of Two Sorted Arrays — LC 4 — H [P][B]
- [x] ✅ Median of Row-wise Sorted Matrix — GfG — H
- [ ] Single Element in a Sorted Array — LC 540 — M
- [ ] Capacity to Ship Packages Within D Days — LC 1011 — M [P]
- [ ] Split Array Largest Sum / Book Allocation — LC 410 — H [P][B]
- [ ] Aggressive Cows — GfG/SPOJ — H [P]
- [ ] Minimum Days to Make M Bouquets — LC 1482 — M
- [ ] Kth Missing Positive Number — LC 1539 — E
- [ ] Sqrt(x) — LC 69 — E [B]

## 6. Strings

- [x] ✅ Reverse Words in a String — LC 151 — M [B]
- [x] ✅ Roman to Integer — LC 13 — E [B]
- [ ] Integer to Roman — LC 12 — M
- [ ] Longest Common Prefix — LC 14 — E [B]
- [ ] Longest Palindromic Substring — LC 5 — M [P][B]
- [ ] Palindromic Substrings — LC 647 — M
- [ ] String to Integer (atoi) — LC 8 — M [B]
- [ ] Count and Say — LC 38 — M [B]
- [x] ✅ Valid Parentheses — LC 20 — E (see Stack folder)
- [ ] Rotate String / Check if one string is rotation of another — LC 796 — E [B]
- [x] ✅ Character Frequency in a String — basic
- [ ] Sort Characters by Frequency — LC 451 — M
- [ ] Implement strStr() — KMP — LC 28 — E/M [P]
- [ ] Repeated String Match (Rabin–Karp) — LC 686 — M
- [ ] Minimum Characters to Add to Make Palindrome (KMP / LPS) — GfG — H
- [ ] Compress String / String Compression — LC 443 — M [B]
- [ ] Decode String — LC 394 — M [P]

## 7. Linked List

- [x] ✅ Implement Singly / Doubly / Circular Linked List
- [x] ✅ Middle of the Linked List — LC 876 — E
- [x] ✅ Linked List Cycle — LC 141 — E [P][B]
- [ ] Linked List Cycle II (find start) — LC 142 — M
- [ ] Reverse Linked List (iterative + recursive) — LC 206 — E [P][B]
- [ ] Reverse Linked List II — LC 92 — M
- [ ] Reverse Nodes in k-Group — LC 25 — H [P]
- [ ] Merge Two Sorted Lists — LC 21 — E [P][B]
- [ ] Merge k Sorted Lists — LC 23 — H [P]
- [ ] Remove Nth Node From End — LC 19 — M [B]
- [ ] Palindrome Linked List — LC 234 — E [B]
- [ ] Intersection of Two Linked Lists — LC 160 — E [B]
- [ ] Add Two Numbers — LC 2 — M [P][B]
- [x] ✅ Sort List (merge sort on LL) — LC 148 — M
- [ ] Rotate List — LC 61 — M
- [ ] Copy List with Random Pointer — LC 138 — M [P]
- [ ] Flatten a Multilevel / Flatten Linked List — LC 430 / GfG — M
- [ ] Odd Even Linked List — LC 328 — M
- [ ] LRU Cache — LC 146 — M [P][B] **(very common)**
- [ ] LFU Cache — LC 460 — H [P]

## 8. Stack & Queue

- [x] ✅ Implement Stack / Queue (array + linked list), Circular Queue
- [x] ✅ Valid Parentheses — LC 20 — E [P][B]
- [x] ✅ Min Stack — LC 155 — M [P][B]
- [x] ✅ Next Greater Element I — LC 496 — E
- [ ] Next Greater Element II (circular) — LC 503 — M
- [ ] Daily Temperatures — LC 739 — M [P]
- [ ] Stock Span Problem — LC 901 — M [B]
- [ ] Largest Rectangle in Histogram — LC 84 — H [P][B]
- [ ] Maximal Rectangle — LC 85 — H
- [ ] Implement Queue using Stacks — LC 232 — E [B]
- [ ] Implement Stack using Queues — LC 225 — E [B]
- [ ] Evaluate Reverse Polish Notation — LC 150 — M
- [ ] Infix to Postfix conversion — GfG — M [B]
- [ ] Asteroid Collision — LC 735 — M
- [ ] Remove K Digits — LC 402 — M
- [ ] Sum of Subarray Minimums — LC 907 — M
- [ ] Celebrity Problem — GfG — M [B]
- [ ] Basic Calculator II — LC 227 — M [P]

## 9. Recursion & Backtracking

- [x] ✅ Basics: factorial, fibonacci, sum/product of digits, reverse number, patterns
- [ ] Subsets — LC 78 — M [P][B]
- [ ] Subsets II — LC 90 — M
- [ ] Permutations — LC 46 — M [P][B]
- [ ] Permutations II — LC 47 — M
- [ ] Combination Sum — LC 39 — M [P]
- [ ] Combination Sum II — LC 40 — M
- [ ] Generate Parentheses — LC 22 — M [P]
- [ ] Letter Combinations of a Phone Number — LC 17 — M [P]
- [ ] Palindrome Partitioning — LC 131 — M
- [ ] Word Search — LC 79 — M [P][B]
- [ ] N-Queens — LC 51 — H [P][B]
- [ ] Sudoku Solver — LC 37 — H
- [ ] Rat in a Maze — GfG — M [B]
- [ ] Pow(x, n) — LC 50 — M [B]

## 10. Trees (Binary Tree)

- [ ] Inorder / Preorder / Postorder — recursive **and** iterative — LC 94/144/145 — E [P][B]
- [ ] Level Order Traversal — LC 102 — M [P][B]
- [ ] Zigzag Level Order — LC 103 — M [P]
- [ ] Maximum Depth of Binary Tree — LC 104 — E [B]
- [ ] Diameter of Binary Tree — LC 543 — E [P]
- [ ] Balanced Binary Tree — LC 110 — E
- [ ] Same Tree / Symmetric Tree — LC 100 / 101 — E [B]
- [ ] Invert Binary Tree — LC 226 — E
- [ ] Binary Tree Right Side View — LC 199 — M [P]
- [ ] Top View / Bottom View / Vertical Order — GfG / LC 987 — M/H [P]
- [ ] Lowest Common Ancestor of a Binary Tree — LC 236 — M [P][B]
- [ ] Path Sum I / II — LC 112 / 113 — E/M
- [ ] Binary Tree Maximum Path Sum — LC 124 — H [P]
- [ ] Construct Tree from Preorder + Inorder — LC 105 — M [P]
- [ ] Serialize and Deserialize Binary Tree — LC 297 — H [P]
- [ ] All Nodes Distance K — LC 863 — M [P]
- [ ] Maximum Width of Binary Tree — LC 662 — M
- [ ] Flatten Binary Tree to Linked List — LC 114 — M
- [ ] Boundary Traversal — GfG — M [P]
- [ ] Children Sum Property / Burn a Tree — GfG — M

## 11. Binary Search Tree

- [ ] Search / Insert / Delete in BST — LC 700 / 701 / 450 — E/M [B]
- [ ] Validate BST — LC 98 — M [P][B]
- [ ] Kth Smallest Element in a BST — LC 230 — M [P]
- [ ] LCA of a BST — LC 235 — M [B]
- [ ] Convert Sorted Array to BST — LC 108 — E
- [ ] Inorder Successor in BST — LC 285 — M
- [ ] Two Sum IV – Input is a BST — LC 653 — E
- [ ] BST Iterator — LC 173 — M [P]
- [ ] Recover BST — LC 99 — M
- [ ] Largest BST in a Binary Tree — GfG — H

## 12. Heap / Priority Queue

- [x] ✅ Kth Largest Element — LC 215 — M [P][B]
- [x] ✅ Top K Frequent Elements — LC 347 — M [P]
- [ ] K Closest Points to Origin — LC 973 — M [P]
- [ ] Merge K Sorted Arrays / Lists — LC 23 — H [P]
- [ ] Find Median from Data Stream — LC 295 — H [P][B]
- [ ] Task Scheduler — LC 621 — M [P]
- [ ] Reorganize String — LC 767 — M
- [ ] Minimum Cost to Connect Ropes — GfG — E [B]
- [ ] Implement Min-Heap from scratch — [B]

## 13. Graphs

- [ ] BFS & DFS traversal (adjacency list) — basics [P][B]
- [ ] Number of Islands — LC 200 — M [P][B]
- [ ] Flood Fill — LC 733 — E
- [ ] Rotting Oranges — LC 994 — M [P]
- [ ] Clone Graph — LC 133 — M [P]
- [ ] Detect Cycle in Undirected Graph (BFS/DFS) — GfG — M [B]
- [ ] Detect Cycle in Directed Graph — GfG — M [P]
- [ ] Course Schedule I / II (Topological Sort, Kahn's) — LC 207 / 210 — M [P][B]
- [ ] Alien Dictionary — LC 269 — H [P]
- [ ] Is Graph Bipartite? — LC 785 — M
- [ ] 01 Matrix / Surrounded Regions — LC 542 / 130 — M
- [ ] Word Ladder — LC 127 — H [P]
- [ ] Dijkstra's Algorithm / Network Delay Time — LC 743 — M [P][B]
- [ ] Cheapest Flights Within K Stops (Bellman-Ford) — LC 787 — M [P]
- [ ] Floyd–Warshall — GfG — M
- [ ] Minimum Spanning Tree (Prim's / Kruskal's) — GfG / LC 1584 — M [P]
- [ ] Disjoint Set Union (Union-Find) — Number of Provinces — LC 547 — M [P]
- [ ] Accounts Merge — LC 721 — M [P]
- [ ] Kosaraju's Algorithm (Strongly Connected Components) — GfG — H
- [ ] Bridges in a Graph (Tarjan's) — LC 1192 — H

## 14. Dynamic Programming

**1D DP**
- [x] ✅ Fibonacci / Tribonacci (memo + tabulation)
- [ ] Climbing Stairs — LC 70 — E [P][B]
- [x] ✅ House Robber (Stickler Thief) — LC 198 — M [P][B]
- [ ] House Robber II — LC 213 — M
- [ ] Decode Ways — LC 91 — M [P]
- [ ] Word Break — LC 139 — M [P][B]
- [ ] Jump Game I / II — LC 55 / 45 — M [P][B]

**2D / Grid DP**
- [ ] Unique Paths I / II — LC 62 / 63 — M [P][B]
- [ ] Minimum Path Sum — LC 64 — M
- [ ] Triangle — LC 120 — M
- [ ] Cherry Pickup II — LC 1463 — H

**Subsequence / Knapsack**
- [x] ✅ Subset Sum — GfG — M [B]
- [ ] Partition Equal Subset Sum — LC 416 — M [P]
- [ ] 0/1 Knapsack — GfG — M [P][B]
- [ ] Unbounded Knapsack / Rod Cutting — GfG — M
- [ ] Coin Change — LC 322 — M [P][B] **(very common)**
- [ ] Coin Change II — LC 518 — M [B]
- [ ] Target Sum — LC 494 — M

**Strings DP**
- [x] ✅ Longest Common Subsequence — LC 1143 — M [P][B]
- [ ] Longest Common Substring — GfG — M
- [ ] Longest Palindromic Subsequence — LC 516 — M
- [ ] Edit Distance — LC 72 — H [P][B]
- [ ] Distinct Subsequences — LC 115 — H
- [ ] Wildcard Matching / Regular Expression Matching — LC 44 / 10 — H [P]

**LIS & others**
- [ ] Longest Increasing Subsequence (O(n²) and O(n log n)) — LC 300 — M [P][B]
- [ ] Russian Doll Envelopes — LC 354 — H
- [ ] Matrix Chain Multiplication — GfG — H [P]
- [ ] Burst Balloons — LC 312 — H
- [ ] Maximal Square — LC 221 — M [P]
- [ ] Buy and Sell Stock with Cooldown — LC 309 — M

## 15. Greedy

- [ ] N Meetings in One Room / Activity Selection — GfG — E [B]
- [ ] Minimum Platforms — GfG — M [B]
- [ ] Job Sequencing Problem — GfG — M [B]
- [ ] Fractional Knapsack — GfG — M [B]
- [ ] Gas Station — LC 134 — M [P]
- [ ] Candy — LC 135 — H
- [ ] Assign Cookies — LC 455 — E
- [ ] Minimum Number of Arrows to Burst Balloons — LC 452 — M
- [ ] Valid Parenthesis String — LC 678 — M

## 16. Trie

- [ ] Implement Trie — LC 208 — M [P]
- [ ] Word Search II — LC 212 — H [P]
- [ ] Longest Word With All Prefixes — GfG — M
- [ ] Maximum XOR of Two Numbers — LC 421 — M
- [ ] Design Search Autocomplete System — LC 642 — H [P]

## 17. Bit Manipulation

- [ ] Single Number I / II / III — LC 136 / 137 / 260 — E/M [B]
- [ ] Number of 1 Bits — LC 191 — E [B]
- [ ] Counting Bits — LC 338 — E
- [ ] Power of Two — LC 231 — E [B]
- [ ] Reverse Bits — LC 190 — E
- [ ] Sum of Two Integers without + — LC 371 — M
- [ ] Subsets using bitmask — LC 78 — M

## 18. Math & Number Theory (common in GS / MS / JPMC)

- [x] ✅ Happy Number — LC 202 — E
- [ ] Sieve of Eratosthenes / Count Primes — LC 204 — M [B]
- [ ] GCD / LCM (Euclid) — basic [B]
- [ ] Fast Exponentiation / Modular Exponentiation — basic [B]
- [ ] Excel Sheet Column Title / Number — LC 168 / 171 — E [B]
- [ ] Reverse Integer (overflow handling) — LC 7 — M [B]
- [ ] Fraction to Recurring Decimal — LC 166 — M [B] *(GS favourite)*
- [ ] Multiply Strings / Add Strings — LC 43 / 415 — M [B]
- [ ] Trailing Zeroes in Factorial — LC 172 — M
- [ ] Count Primes in a Range / nCr % p — GfG — M

## 19. Design-style DSA Questions

- [ ] LRU Cache — LC 146 [P][B]
- [ ] Design Twitter — LC 355 [P]
- [ ] Time Based Key-Value Store — LC 981 [P]
- [ ] Design Hit Counter — LC 362 [P]
- [ ] Implement a rate limiter (token bucket) — [P][B]
- [ ] Design a Parking Lot / ATM / Bank Account system (OOP LLD) — [B]

---

## 20. Topics You Still Need to Learn (based on what's in this repo)

**Already covered in the repo:** sorting (bubble, selection, insertion, merge, quick, cyclic), binary search (many variants), recursion basics, two pointers, sliding window basics, fast & slow pointers, linked list, stack, queue, hashing, top-K, Kadane's algorithm, prefix sum, and early DP (Fibonacci, LCS, subset sum, house robber).

### Priority 1 — must learn (asked in almost every interview)
1. **Binary Trees** — traversals (recursive + iterative), level order, views, LCA, diameter, path sum, construct from traversals.
2. **Binary Search Trees** — insert/delete, validate, kth smallest, iterator.
3. **Graphs** — BFS/DFS, cycle detection, topological sort, Dijkstra, Union-Find, grid problems (islands, rotting oranges).
4. **Backtracking** — subsets, permutations, combination sum, N-Queens, word search. (You know recursion; this is the next step.)
5. **Heaps / Priority Queue** — build your own heap, median of stream, merge K sorted.
6. **Dynamic Programming in depth** — Knapsack family, LIS, Edit Distance, grid DP, partition DP (MCM), DP on strings. Practise **recursion → memoization → tabulation → space optimisation** for every problem.

### Priority 2 — important for product companies and Goldman Sachs / Morgan Stanley
7. **Monotonic Stack** — next greater/smaller, histogram, stock span, sum of subarray minimums.
8. **Advanced Sliding Window** — variable-size windows with a hashmap (min window substring, at-most-K trick).
9. **Binary Search on Answer** — book allocation, aggressive cows, ship packages, split array.
10. **Intervals** — merge, insert, meeting rooms, min platforms.
11. **Greedy algorithms** — activity selection, job sequencing, gas station.
12. **Trie** — insert/search/prefix, word search II, max XOR.
13. **Bit Manipulation** — XOR tricks, bit counting, bitmask subsets.
14. **String Algorithms** — KMP (LPS array), Rabin–Karp, Z-algorithm.

### Priority 3 — advanced or for "good to have" depth
15. **Segment Tree / Fenwick Tree (BIT)** — range sum or min queries with updates.
16. **Advanced Graphs** — Bellman-Ford, Floyd–Warshall, Prim/Kruskal MST, Kosaraju/Tarjan, bridges and articulation points.
17. **DP on Trees and Bitmask DP** — e.g. travelling salesman, house robber III.
18. **Math** — sieve, modular arithmetic, nCr, fast power.

### Non-DSA topics asked in the same rounds (especially at banks)
- **Java core:** OOP pillars, `equals()`/`hashCode()` contract, how `HashMap` works internally (buckets, treeification), `String` immutability, Collections framework, Comparable vs Comparator, exceptions, Java 8 streams and lambdas.
- **Multithreading:** threads vs Runnable, `synchronized`, `volatile`, deadlock, `ExecutorService`, producer–consumer, `ConcurrentHashMap`.
- **SQL:** joins, GROUP BY / HAVING, Nth highest salary, window functions (`RANK`, `DENSE_RANK`, `ROW_NUMBER`), indexes, normalisation.
- **OOP / Low-Level Design:** SOLID, design patterns (Singleton, Factory, Builder, Strategy, Observer), plus LLD problems like parking lot, ATM, library management, splitwise.
- **CS fundamentals:** OS (process vs thread, scheduling, deadlock, paging), DBMS (ACID, transactions, isolation levels), networks (TCP vs UDP, HTTP, what happens when you type a URL).
- **Puzzles (GS, MS, JPMC):** 25 horses, burning ropes, egg drop, 3 bulbs and 3 switches, poisoned wine bottles.
- **Complexity analysis:** be ready to state and justify time and space complexity for every solution.

---

## 21. Suggested 12-Week Plan

| Week | Focus |
|------|-------|
| 1 | Finish the unchecked Arrays + Prefix Sum/Hashing problems |
| 2 | Strings + Sliding Window (advanced) |
| 3 | Linked List (reversal patterns, LRU Cache) + Monotonic Stack |
| 4 | Recursion → Backtracking |
| 5 | Binary Trees |
| 6 | BST + Heaps |
| 7 | Graphs I — BFS/DFS, cycles, topo sort, grid problems |
| 8 | Graphs II — shortest paths, MST, Union-Find |
| 9 | DP I — 1D, grid, knapsack family |
| 10 | DP II — strings, LIS, partition DP |
| 11 | Greedy, Trie, Bit Manipulation, Binary Search on Answer |
| 12 | Mock interviews, company-tagged practice, Java/SQL/OOP revision |

**Tips**
- Aim for **2–3 problems a day**, timed (Easy 15 min, Medium 30 min, Hard 45 min).
- For every problem, write down the **pattern** it uses. Interviews test whether you recognise patterns, not whether you remember problems.
- Revisit problems you got wrong after 3 days and again after 7 days.
- Explain your approach out loud before coding; interviewers grade communication too.
- For bank interviews, also practise on **HackerRank** (the platform most of their online assessments use).
