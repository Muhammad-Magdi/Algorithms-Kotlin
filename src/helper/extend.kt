package helper

fun extend(A: IntArray): IntArray {
  val B = IntArray(A.size * 2)
  for (i in A.indices) {
    B[i] = A[i]
  }
  return B
}
