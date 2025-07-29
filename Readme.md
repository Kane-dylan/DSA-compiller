# 📚 DSA Compiler - Data Structures & Algorithms Practice

A comprehensive collection of Java implementations for Data Structures and Algorithms practice.

## 🗂️ Project Structure

```
DSA/
├── Array/           # Array algorithms and operations
├── Basic/           # Basic programming concepts
├── Hashing/         # Hash table implementations
├── Mapping/         # Map-based solutions
├── Recursion/       # Recursive algorithms
├── Sorting/         # Sorting algorithms
└── Test/            # Test files
```

## 🚀 Quick Start

1. **Compile & Run**: Use the provided batch file

   ```cmd
   run-java.bat <path-to-java-file>
   ```

2. **Input/Output**: Files are located in `IO/` folder

   - `input.txt` - Input data
   - `output.txt` - Program output

## 📁 File Navigation

### 📊 Basic Concepts

- [`CountNo.java`](DSA/Basic/CountNo.java) - Count digits in a number
- [`ReverseNum.java`](DSA/Basic/ReverseNum.java) - Reverse a number with overflow check
- [`Palindrome.java`](DSA/Basic/Palindrome.java) - Check if number is palindrome

### 🔢 Array Operations

- [`LargeNum.java`](DSA/Array/LargeNum.java) - Find largest number in array
- [`SecLargestNum.java`](DSA/Array/SecLargestNum.java) - Find second largest number
- [`SmallestNum.java`](DSA/Array/SmallestNum.java) - Find smallest and second smallest
- [`SortedArrCheck.java`](DSA/Array/SortedArrCheck.java) - Check if array is sorted
- [`RemoveDup.java`](DSA/Array/RemoveDup.java) - Remove duplicates from sorted array
- [`LeftRotateOne.java`](DSA/Array/LeftRotateOne.java) - Left rotate array by one position
- [`LeftRotateDth.java`](DSA/Array/LeftRotateDth.java) - Left rotate array by D positions
- [`LeftRotateDthOpt.java`](DSA/Array/LeftRotateDthOpt.java) - Optimized left rotation
- [`RightRotateDth.java`](DSA/Array/RightRotateDth.java) - Right rotate array by D positions
- [`RightRotateDthOpt.java`](DSA/Array/RightRotateDthOpt.java) - Optimized right rotation
- [`MoveZeroEnd.java`](DSA/Array/MoveZeroEnd.java) - Move zeros to end of array
- [`MoveZeroEndOpt.java`](DSA/Array/MoveZeroEndOpt.java) - Optimized move zeros to end
- [`LinearSearch.java`](DSA/Array/LinearSearch.java) - Linear search in array
- [`UnionSortedArr.java`](DSA/Array/UnionSortedArr.java) - Union of two sorted arrays (using Set)
- [`UnionSortedArrOpt.java`](DSA/Array/UnionSortedArrOpt.java) - Optimized union using two pointers

### 🔍 Hashing

- [`HashAll.java`](DSA/Hashing/HashAll.java) - Hash all ASCII characters
- [`HashNum.java`](DSA/Hashing/HashNum.java) - Hash numbers
- [`HashStr.java`](DSA/Hashing/HashStr.java) - Hash lowercase strings

### 🗺️ Mapping

- [`Map.java`](DSA/Mapping/Map.java) - HashMap for integers
- [`MapStr.java`](DSA/Mapping/MapStr.java) - HashMap for strings

### 🔄 Sorting Algorithms

- [`SelectionSort.java`](DSA/Sorting/SelectionSort.java) - Selection sort implementation
- [`SelectionSortFn.java`](DSA/Sorting/SelectionSortFn.java) - Selection sort using function
- [`InsertionSort.java`](DSA/Sorting/InsertionSort.java) - Insertion sort implementation
- [`InsertionSortFn.java`](DSA/Sorting/InsertionSortFn.java) - Insertion sort using function
- [`BubbleSort.java`](DSA/Sorting/BubbleSort.java) - Bubble sort implementation
- [`BubbleSortFn.java`](DSA/Sorting/BubbleSortFn.java) - Bubble sort with optimization
- [`MergeSort.java`](DSA/Sorting/MergeSort.java) - Merge sort (divide and conquer)
- [`QuickSort.java`](DSA/Sorting/QuickSort.java) - Quick sort with pivot partitioning

### 🔄 Recursion

- [`PrintName.java`](DSA/Recursion/PrintName.java) - Print name N times
- [`PrintNum.java`](DSA/Recursion/PrintNum.java) - Print numbers 1 to N
- [`PrintRevNum.java`](DSA/Recursion/PrintRevNum.java) - Print numbers N to 1
- [`PrintNewNum.java`](DSA/Recursion/PrintNewNum.java) - Alternative print N to 1
- [`PrintNewRevNum.java`](DSA/Recursion/PrintNewRevNum.java) - Alternative print 1 to N
- [`Sum.java`](DSA/Recursion/Sum.java) - Sum of first N numbers
- [`SumFn.java`](DSA/Recursion/SumFn.java) - Sum using return values
- [`Mult.java`](DSA/Recursion/Mult.java) - Factorial calculation
- [`MultFn.java`](DSA/Recursion/MultFn.java) - Factorial using return values
- [`Fibonacci.java`](DSA/Recursion/Fibonacci.java) - Fibonacci sequence
- [`Palindorme.java`](DSA/Recursion/Palindorme.java) - Check palindrome string
- [`ArrRev.java`](DSA/Recursion/ArrRev.java) - Reverse array using index
- [`ArrSwap.java`](DSA/Recursion/ArrSwap.java) - Reverse array using pointers

### ♻️ Recursive Algorithms

### 🧪 Test Files

- [`Demo.java`](DSA/Test/Demo.java) - Basic input/output demo
- [`Test.java`](DSA/Test/Test.java) - Test implementation

---

## 📋 Reference Tables

### 🔸 Java Collections Framework

| Category        | Interface/Class                        | Description                         |
| --------------- | -------------------------------------- | ----------------------------------- |
| **List**        | `ArrayList`                            | Dynamic array                       |
|                 | `LinkedList`                           | Doubly linked list                  |
|                 | `Vector`                               | Thread-safe dynamic array           |
|                 | `Stack`                                | LIFO stack (extends Vector)         |
| **Set**         | `HashSet`                              | Unordered, unique elements          |
|                 | `LinkedHashSet`                        | Ordered by insertion                |
|                 | `TreeSet`                              | Sorted (uses Red-Black Tree)        |
| **Map**         | `HashMap`                              | Unordered key-value pairs           |
|                 | `LinkedHashMap`                        | Maintains insertion order           |
|                 | `TreeMap`                              | Sorted by key                       |
|                 | `Hashtable`                            | Legacy, synchronized map            |
|                 | `ConcurrentHashMap`                    | Thread-safe HashMap                 |
| **Queue/Deque** | `PriorityQueue`                        | Min-heap by default                 |
|                 | `ArrayDeque`                           | Resizable deque                     |
| **Others**      | `Collections` (class)                  | Utility class (sort, shuffle, etc.) |
|                 | `Arrays` (class)                       | Utility for array ops               |
| **Concurrency** | `BlockingQueue`, `ConcurrentMap`, etc. | Thread-safe variants                |

<details>
<summary><strong>🔸 C++ vs Java vs Python vs JavaScript – Data Structures Comparison</strong></summary>

| **Category**        | **C++ STL**            | **Java**               | **Python**                                | **JavaScript**                |
| ------------------- | ---------------------- | ---------------------- | ----------------------------------------- | ----------------------------- |
| **Dynamic Array**   | `vector`               | `ArrayList`            | `list`                                    | `Array`                       |
| **Linked List**     | `list`, `forward_list` | `LinkedList`           | `collections.deque`                       | Manual using objects/nodes    |
| **Stack**           | `stack`                | `Stack`, `Deque`       | `list` / `deque`                          | `Array.push()` / `pop()`      |
| **Queue**           | `queue`                | `Queue`, `Deque`       | `deque`, `queue.Queue`                    | `Array.push()` / `shift()`    |
| **Priority Queue**  | `priority_queue`       | `PriorityQueue`        | `heapq` module                            | Implement manually            |
| **Deque**           | `deque`                | `ArrayDeque`           | `collections.deque`                       | Custom (via `Array`)          |
| **Set (Ordered)**   | `set`                  | `TreeSet`              | `sortedcontainers`                        | `Set` (insertion order)       |
| **Set (Unordered)** | `unordered_set`        | `HashSet`              | `set`                                     | `Set`                         |
| **Map (Ordered)**   | `map`                  | `TreeMap`              | `collections.OrderedDict` (Py < 3.7)      | `Map` (insertion order)       |
| **Map (Unordered)** | `unordered_map`        | `HashMap`              | `dict` (unordered pre-3.7, ordered after) | `Object` or `Map`             |
| **Multimap**        | `multimap`             | `Map<K, List<V>>`      | `defaultdict(list)`                       | `Map<K, Array>` or Object     |
| **Multiset**        | `multiset`             | N/A                    | `collections.Counter`                     | `Object` with counts          |
| **Thread-safe Map** | N/A                    | `ConcurrentHashMap`    | `threading.Lock + dict`                   | Use locks or libraries        |
| **Sorting**         | `<algorithm>`          | `Collections.sort()`   | `sorted()`, `.sort()`                     | `Array.sort()`                |
| **Iterators**       | Iterators              | `Iterator`, `Iterable` | `iter()`, `next()`                        | `Symbol.iterator`, `for...of` |
| **Utilities**       | `<algorithm>`          | `Collections`          | `itertools`, `functools`                  | Lodash, Underscore.js         |

</details>
