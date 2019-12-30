package algorithms.naive

import kotlin.random.Random

/**
 * Places the last value in the array into its correct position, such that all the preceding values
 * are smaller that it and all the succeeding values are greater that it.
 *
 *  Time Complexity:
 *  - O(A.size)
 *
 *  Memory Complexity:
 *  - O(1)
 */
fun partition(A: IntArray, startIndex: Int, endIndex: Int): Int {
  var sureSmaller = startIndex - 1
  for (i in startIndex until endIndex - 1) {
    if (A[i] <= A[endIndex - 1]) {
      ++sureSmaller
      A[sureSmaller] = A[i].also { A[i] = A[sureSmaller] }
    }
  }
  A[sureSmaller + 1] = A[endIndex - 1].also { A[endIndex - 1] = A[sureSmaller + 1] }
  return sureSmaller + 1
}

fun randomizedPartition(A: IntArray, startIndex: Int, endIndex: Int): Int {
  val pivot = Random.nextInt(startIndex, endIndex)
  A[pivot] = A[endIndex - 1].also { A[endIndex - 1] = A[pivot] }
  return partition(A, startIndex, endIndex)
}