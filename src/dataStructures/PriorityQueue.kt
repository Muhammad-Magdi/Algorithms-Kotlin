package dataStructures

class PriorityQueue {
  val tree: HeapTree

  constructor() {
    tree = HeapTree()
  }

  constructor(A: IntArray) {
    tree = HeapTree(A)
  }

  fun push(v: Int) {
    tree.insert(v)
  }

  fun pop(): Int {
    return tree.removeMax()
  }

  fun top(): Int {
    return tree.getMax()
  }

  fun size(): Int {
    return tree.size()
  }

  fun isEmpty(): Boolean {
    return tree.size() == 0
  }
}