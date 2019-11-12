import algorithms.*

fun main() {
  val arr = intArrayOf(1, 3, 5, 70, -1, -2, -6, 10)
//  insert(arr, 4, arr[4])
//  insertionSort(arr)
//  val minIndex = selectMin(arr)
//  println(minIndex)
//  selectionSort(arr)
//  val mergedArray = mergeArrays(arr, arr, 0, 4, 4, 8)
//  mergeSort(arr)
//  bubbleSort(arr)
//  arr.forEach { println(it) }
//  println(maxPrefixSum(arr, 0, 5))
  println(algorithms.divideAndConquer.maximumSubArray(arr, 3, 7))
  println(algorithms.bruteForce.maximumSubArray(arr, 3, 7))
  println(algorithms.greedy.maximumSubArray(arr, 3, 7))
}
