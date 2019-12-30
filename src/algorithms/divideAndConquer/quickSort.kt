package algorithms.divideAndConquer

import algorithms.naive.partition
import algorithms.naive.randomizedPartition

/**
 * Sorts the array `A` ascendingly in-place.
 *
 *  Time Complexity:
 *  - O(A.size*log(A.size)) in average case
 *  - O(A.size ^ 2) in the worst case
 *
 *  Memory Complexity:
 *  - O(1)
 */
fun quickSort(A: IntArray, startIndex: Int = 0, endIndex: Int = A.size) {
  if (endIndex - startIndex <= 1)
    return
  val partitionPoint = randomizedPartition(A, startIndex, endIndex)
  quickSort(A, startIndex, partitionPoint)
  quickSort(A, partitionPoint + 1, endIndex)
}