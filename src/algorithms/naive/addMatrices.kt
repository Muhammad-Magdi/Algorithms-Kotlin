package algorithms.naive

import dataStructures.Matrix
import java.lang.Exception

fun addMatrices(A: Matrix, B: Matrix): Matrix {
  if (A.rows != B.rows || A.cols != B.cols) {
    throw Exception("Can't add matrices of non-equal sizes!")
  }

  val C = Matrix(A.rows, A.cols)
  for (i in 0 until A.rows) {
    for (j in 0 until A.cols) {
      C[i][j] = A[i][j] + B[i][j]
    }
  }
  return C
}
