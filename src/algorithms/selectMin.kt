package algorithms

/**
 * Returns the index of the minimum element in the `arr` starting from `startIndex`
 *
 *  Assumptions:
 *  - `startIndex` < `arr`.size
 *
 *  Time Complexity:
 *  - O(arr.size)
 *
 *  Memory Complexity:
 *  - O(1)
 */
fun selectMin(arr: IntArray, startIndex: Int = 0): Int {
  var minIndex = startIndex
  for (i in startIndex + 1 until arr.size) {
    if (arr[i] < arr[minIndex]) {
      minIndex = i
    }
  }
  return minIndex
}