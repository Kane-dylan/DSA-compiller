#### **🔸 Java Collections Framework**

| Category              | Interface/Class                            | Description                         |
| --------------------- | ------------------------------------------ | ----------------------------------- |
| **List**        | `ArrayList`                              | Dynamic array                       |
|                       | `LinkedList`                             | Doubly linked list                  |
|                       | `Vector`                                 | Thread-safe dynamic array           |
|                       | `Stack`                                  | LIFO stack (extends Vector)         |
| **Set**         | `HashSet`                                | Unordered, unique elements          |
|                       | `LinkedHashSet`                          | Ordered by insertion                |
|                       | `TreeSet`                                | Sorted (uses Red-Black Tree)        |
| **Map**         | `HashMap`                                | Unordered key-value pairs           |
|                       | `LinkedHashMap`                          | Maintains insertion order           |
|                       | `TreeMap`                                | Sorted by key                       |
|                       | `Hashtable`                              | Legacy, synchronized map            |
|                       | `ConcurrentHashMap`                      | Thread-safe HashMap                 |
| **Queue/Deque** | `PriorityQueue`                          | Min-heap by default                 |
|                       | `ArrayDeque`                             | Resizable deque                     |
| **Others**      | `Collections` (class)                    | Utility class (sort, shuffle, etc.) |
|                       | `Arrays` (class)                         | Utility for array ops               |
| **Concurrency** | `BlockingQueue`, `ConcurrentMap`, etc. | Thread-safe variants                |

#### **🔸 C++ vs Java vs Python vs JavaScript – Data Structures Comparison Table**

| **Category**        | **C++ STL**          | **Java**             | **Python**                            | **JavaScript**              |
| ------------------------- | -------------------------- | -------------------------- | ------------------------------------------- | --------------------------------- |
| **Dynamic Array**   | `vector`                 | `ArrayList`              | `list`                                    | `Array`                         |
| **Linked List**     | `list`, `forward_list` | `LinkedList`             | `collections.deque`                       | Manual using objects/nodes        |
| **Stack**           | `stack`                  | `Stack`, `Deque`       | `list` / `deque`                        | `Array.push()` / `pop()`      |
| **Queue**           | `queue`                  | `Queue`, `Deque`       | `deque`, `queue.Queue`                  | `Array.push()` / `shift()`    |
| **Priority Queue**  | `priority_queue`         | `PriorityQueue`          | `heapq` module                            | Implement manually                |
| **Deque**           | `deque`                  | `ArrayDeque`             | `collections.deque`                       | Custom (via `Array`)            |
| **Set (Ordered)**   | `set`                    | `TreeSet`                | `sortedcontainers`                        | `Set` (insertion order)         |
| **Set (Unordered)** | `unordered_set`          | `HashSet`                | `set`                                     | `Set`                           |
| **Map (Ordered)**   | `map`                    | `TreeMap`                | `collections.OrderedDict` (Py < 3.7)      | `Map` (insertion order)         |
| **Map (Unordered)** | `unordered_map`          | `HashMap`                | `dict` (unordered pre-3.7, ordered after) | `Object` or `Map`             |
| **Multimap**        | `multimap`               | `Map<K, List<V>>`        | `defaultdict(list)`                       | `Map<K, Array>` or Object       |
| **Multiset**        | `multiset`               | N/A                        | `collections.Counter`                     | `Object` with counts            |
| **Thread-safe Map** | N/A                        | `ConcurrentHashMap`      | `threading.Lock + dict`                   | Use locks or libraries            |
| **Sorting**         | `<algorithm>`            | `Collections.sort()`     | `sorted()`, `.sort()`                   | `Array.sort()`                  |
| **Iterators**       | Iterators                  | `Iterator`, `Iterable` | `iter()`, `next()`                      | `Symbol.iterator`, `for...of` |
| **Utilities**       | `<algorithm>`            | `Collections`            | `itertools`, `functools`                | Lodash, Underscore.js             |
