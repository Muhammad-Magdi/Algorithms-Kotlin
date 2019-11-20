package dataStructures

import algorithms.naive.addMatrices
import algorithms.naive.multiplyMatrices

class Matrix(val rows: Int, val cols: Int) {
  private val mat = Array(rows) { Row(cols) }

  operator fun plus(B: Matrix): Matrix {
    return addMatrices(this, B)
  }

  operator fun times(B: Matrix): Matrix {
    return multiplyMatrices(this, B)
  }

  operator fun get(i: Int): Row {
    return mat[i]
  }

  fun print() {
    for (i in mat.indices) {
      mat[i].print()
    }
  }
}