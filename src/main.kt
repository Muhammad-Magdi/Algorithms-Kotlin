import dataStructures.PriorityQueue

fun main() {
  val t = PriorityQueue(intArrayOf(1, 3, 0, 10, 2))

  while (!t.isEmpty()) {
    println(t.pop())
  }
}
