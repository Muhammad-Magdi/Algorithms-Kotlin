package algorithms

/**
 * Sorts the array `arr` ascendingly in-place.
 *
 *  Time Complexity:
 *  - Best Case when `arr` is already sorted = O(arr.size).
 *  - Worst Case = O(arr.size^2).
 *
 *  Memory Complexity:
 *  - O(1)
 */
fun insertionSort(arr: IntArray) {
  for (i in arr.indices) {
    insert(arr, i, arr[i])
  }
}