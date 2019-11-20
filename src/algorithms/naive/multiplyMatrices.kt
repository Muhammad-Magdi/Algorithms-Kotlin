package algorithms.naive

import dataStructures.Matrix

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
fun multiplyMatrices(A: Matrix, B: Matrix): Matrix {
  if (A.cols != B.rows) {
    throw Exception("Can't Multiply Matrices: Invalid Dimensions!")
  }

  val C = Matrix(A.rows, B.cols)
  for (i in 0 until A.rows) {
    for (j in 0 until B.cols) {
      C[i][j] = 0
      for (k in 0 until B.rows) {
        C[i][j] += A[i][k] * B[k][j]
      }
    }
  }
  return C
}