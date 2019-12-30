import algorithms.divideAndConquer.quickSort

fun main() {
  val A = intArrayOf(3, 2, 4, 5, 7, 1, 8, 6)
  quickSort(A)
  A.forEach { println(it) }
}
