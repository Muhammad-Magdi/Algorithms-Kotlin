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
fun bubbleSort(arr: IntArray) {
  for (i in 0 until arr.size - 1) {
    var swapped = false
    for (j in arr.size - 1 downTo i + 1) {
      if (arr[j] < arr[j-1]) {
        arr[j] = arr[j-1].also { arr[j-1] = arr[j] }
        swapped = true
      }
    }
    if (!swapped)
      break
  }
}