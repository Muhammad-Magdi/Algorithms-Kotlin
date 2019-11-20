package dataStructures

class Row(size: Int) {
  private val arr = IntArray(size)

  fun size(): Int {
    return arr.size
  }

  operator fun get(i: Int): Int {
    return arr[i]
  }

  operator fun set(i: Int, value: Int) {
    arr[i] = value
  }

  fun print() {
    for (i in arr.indices) {
      print(arr[i].toString() + if (i + 1 == arr.size) "\n" else " ")
    }
  }
}
