package algorithms

/**
 * Sorts the array `arr` ascendingly in-place.
 *
 *  Time Complexity:
 *  - O(arr.size^2).
 *
 *  Memory Complexity:
 *  - O(1)
 */
fun selectionSort(arr: IntArray) {
  for (i in arr.indices) {
    val minIndex = selectMin(arr, i)
    arr[i] = arr[minIndex].also { arr[minIndex] = arr[i] } //Swap
  }
}