import algorithms.*

fun main() {
  val arr = intArrayOf(1, 3, 5, 7, 6, 10, -1, 2)
//  insert(arr, 4, arr[4])
//  insertionSort(arr)
  val minIndex = selectMin(arr)
  println(minIndex)
//  arr.forEach { println(it) }
}
