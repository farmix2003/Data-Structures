# 📚 Data Structures in Java

This repository contains my implementation of core data structures in **Java**, built from scratch to strengthen my understanding of fundamental computer science concepts.

The goal of this project is to master data structures used in **real-world backend development** and **technical interviews**.

---

## 🚀 Implemented Data Structures

### 🔹 Linear Data Structures
- ### ✅ Linked List (Singly)

  Implemented a custom singly linked list in Java with support for:
- add
- addFirst
- add at index
- remove by value
- get by index
- reverse
- size tracking
- node traversal and printing



---
- ### ✅ Stack (LIFO)
  Two stack implementations are included:

#### 1. Static Stack
Array-based stack with fixed capacity.

**Features:**
- generic type support
- push
- pop
- peek
- size
- full/empty checks
- custom `toString()`

**Use case:**  
Useful for understanding stack behavior with fixed memory size.

#### 2. Dynamic Stack
Linked-list-based stack with dynamic size.

**Features:**
- generic type support
- push
- pop
- peek
- size
- empty check
- `Iterable<T>` support for traversal

**Use case:**  
Useful for understanding how stacks can grow dynamically without fixed capacity.

---

#### ✅ Queue (FIFO)

Two implementations are provided to understand both fixed and dynamic queue behavior:

### 1. Static Queue (Array-based, Circular)
Fixed-size queue implemented using a circular array.

**Features:**
- Generic type support
- offer / poll / peek
- size tracking
- full & empty checks
- circular indexing (efficient space usage)
- custom `toString()`

**Use case:**  
Understanding how queues work with fixed capacity and circular memory reuse.

---

### 2. Dynamic Queue (Linked List-based)
Queue implementation using nodes with dynamic size.

**Features:**
- Generic type support
- offer / poll / peek
- size tracking
- empty check
- `Iterable<T>` support for traversal

**Use case:**  
Understanding queue behavior with dynamic memory and efficient O(1) operations.

---

#### ✅ Deque (Double-Ended Queue)

Dynamic deque implementation using a doubly linked list.

**Features:**
- Generic type support
- addFirst / addLast
- removeFirst / removeLast
- peekFirst / peekLast
- size tracking
- empty check
- `Iterable<T>` support for traversal
- custom `toString()`

**Use case:**  
Understanding efficient insertion and removal from both ends using a doubly linked list.

---

### 🔹 Hash-Based Structures
#### ✅ HashMap
Custom hash map implementation using an array of buckets with linked lists.

**Features:**
- Generic key-value support
- put / get / remove
- containsKey
- size tracking
- automatic resizing with rehashing
- custom `toString()`

**Concepts practiced:**
- hashing
- bucket indexing
- collision resolution
- load factor
- resizing and rehashing

  ---

- ⏳ HashSet (Planned)

### 🔹 Tree Structures
- ⏳ Binary Tree (Planned)
- ⏳ Binary Search Tree (BST)
- ⏳ Heap / Priority Queue

### 🔹 Graphs
- ⏳ Graph (BFS, DFS)

---

## 🧠 Learning Focus

This repository focuses on:

- Understanding **how data structures work internally**
- Writing clean and optimized Java code
- Practicing **time & space complexity analysis**
- Preparing for **technical interviews**

---

## ⚙️ Tech Stack

- Java (Core)
- No external libraries (pure implementation)

---

## 📊 Time Complexity

### Linked List
- add (end) → `O(n)`
- addFirst → `O(1)`
- add at index → `O(n)`
- get → `O(n)`
- remove → `O(n)`
- reverse → `O(n)`
- size → `O(1)`

### Stack (Static & Dynamic)
- push → `O(1)`
- pop → `O(1)`
- peek → `O(1)`
- size → `O(1)`

### Queue (Static & Dynamic)
- offer → `O(1)`
- poll → `O(1)`
- peek → `O(1)`
- size → `O(1)`

---

### Deque
- addFirst → `O(1)`
- addLast → `O(1)`
- removeFirst → `O(1)`
- removeLast → `O(1)`
- peekFirst → `O(1)`
- peekLast → `O(1)`
- size → `O(1)`

---

## 📌 Why This Repository?

Instead of relying on built-in Java collections, I implemented these structures manually to:

- Deeply understand internal mechanics
- Improve problem-solving skills
- Build a strong foundation for backend development

---

## 📈 Roadmap

- [x] LinkedList
- [x] Stack
- [x] Queue
- [x] Deque 
- [x] HashMap
- [ ] Binary Search Tree
- [ ] Heap
- [ ] Graph (BFS/DFS)
- [ ] Trie (optional)

---

## 🧪 Future Improvements

- Unit tests for each structure
- Performance benchmarks
- Real-world use cases
- LeetCode-style problems using these structures

---

## 🤝 Contributions

This is a personal learning project, but suggestions and improvements are always welcome.

---

## ⭐ Author

**Farrukh Tugonov**  
Java Backend Developer | React Developer

---
