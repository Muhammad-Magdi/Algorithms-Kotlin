package algorithms.naive

/**
 * Accepts two matrices 'A', 'B' and returns a matrix C = A * C
 *
 * Assumptions:
 * A[0].size == B.size
 *
 * Time Complexity:
 * O(n^3)
 *
 * Memory Complexity:
 * O(1)
 */
fun matrixMultiplication(A: Array<IntArray>, B: Array<IntArray>): Array<IntArray> {
  val C = Array(A.size) { IntArray(B[0].size) }
  for (i in A.indices) {
    for (j in B[0].indices) {
      C[i][j] = 0
      for (k in B.indices) {
        C[i][j] += A[i][k] * B[k][j]
      }
    }
  }
  return C
}