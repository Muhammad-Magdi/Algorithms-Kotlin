import algorithms.*

fun main() {
  val arr = intArrayOf(1, 3, 5, 7, -1, 2, 6, 10)
//  insert(arr, 4, arr[4])
//  insertionSort(arr)
//  val minIndex = selectMin(arr)
//  println(minIndex)
//  selectionSort(arr)
//  val mergedArray = mergeArrays(arr, arr, 0, 4, 4, 8)
  mergeSort(arr)
  arr.forEach { println(it) }
}
