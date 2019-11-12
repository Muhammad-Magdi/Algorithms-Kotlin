package algorithms.divideAndConquer

import algorithms.naive.mergeArrays

/**
 * Sorts the array `arr` ascendingly.
 *
 *  Time Complexity:
 *  - O(arr.size*log(arr.size)).
 *
 *  Memory Complexity:
 *  - O(arr.size)
 */
fun mergeSort(arr: IntArray, startIndex: Int = 0, endIndex: Int = arr.size) {
  val size = endIndex - startIndex
  if (size <= 1)
    return
  mergeSort(arr, startIndex, startIndex + size / 2)
  mergeSort(arr, startIndex + size / 2, endIndex)
  val mergedArray = mergeArrays(
    arr, arr, startIndex, startIndex + size / 2,
    startIndex + size / 2, endIndex
  )
  for (i in startIndex until endIndex)
    arr[i] = mergedArray[i - startIndex]
}