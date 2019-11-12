package algorithms.naive

/**
 * Inserts the `value` in its correct position in the `arr`, so that `arr` becomes ascendingly sorted.
 *
 *  Assumptions:
 *  - `arr` is an array of size at least `sortedSize`+1.
 *  - `arr` is an array whose values in indices [0...sortedSize-1] are already sorted ascendingly.
 *
 *  Time Complexity:
 *  - O(sortedSize)
 *
 *  Memory Complexity:
 *  - O(1)
 */
fun insert(arr: IntArray, sortedSize: Int, value: Int) {
  var i = sortedSize - 1
  while (i >= 0 && arr[i] > value) {
    arr[i + 1] = arr[i]
    --i
  }
  arr[i + 1] = value
}
