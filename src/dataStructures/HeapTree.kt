package dataStructures

import helper.extend

class HeapTree {
  private var A: IntArray
  private var heapSize: Int

  constructor() {
    A = IntArray(1)
    heapSize = 0
  }

  constructor(size: Int) {
    heapSize = size
    A = IntArray(size)
  }

  constructor(arr: IntArray) {
    heapSize = arr.size
    A = arr
    buildHeap()
  }

  fun size(): Int {
    return heapSize
  }

  fun removeMax(): Int {
    A[0] = A[heapSize - 1].also { A[heapSize - 1] = A[0] }
    --heapSize
    heapifyDown(0)
    return A[heapSize]
  }

  fun getMax(): Int {
    return A[0]
  }

  fun insert(v: Int) {
    if (heapSize == A.size) {
      A = extend(A)
    }
    A[heapSize] = v
    heapifyUp(heapSize)
    ++heapSize
  }

  private fun buildHeap() {
    for (i in heapSize / 2 - 1 downTo 0) {
      heapifyDown(i)
    }
  }

  private fun heapifyUp(i: Int) {
    if (i == 0)
      return;
    val p = parent(i)
    if (A[i] > A[p]) {
      A[i] = A[p].also { A[p] = A[i] }
      heapifyUp(p)
    }
  }

  private fun heapifyDown(i: Int) {
    val l = leftChild(i)
    val r = rightChild(i)
    var largest = i
    if (l < heapSize && A[l] > A[i]) {
      largest = l
    }
    if (r < heapSize && A[r] > A[largest]) {
      largest = r
    }
    if (largest != i) {
      A[i] = A[largest].also { A[largest] = A[i] }
      heapifyDown(largest)
    }
  }

  private inline fun parent(i: Int): Int {
    return i / 2
  }

  private inline fun leftChild(i: Int): Int {
    return (i shl 1) + 1
  }

  private inline fun rightChild(i: Int): Int {
    return (i shl 1) + 2
  }
}