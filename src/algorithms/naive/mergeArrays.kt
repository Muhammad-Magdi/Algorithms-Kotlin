package algorithms.naive

/**
 * Merges the two sorted arrays `arrA`, `arrB` into a sorted array `arrC`
 *
 *  Assumptions:
 *  - `arrA`, `arrB` both are ascendingly sorted.
 *
 *  Time Complexity:
 *  - O(arrA.size + arrB.size) i.e linear
 *
 *  Memory Complexity:
 *  - O(arrA.size + arrB.size)
 */

fun mergeArrays(
  arrA: IntArray, arrB: IntArray,
  startA: Int = 0, endA: Int = arrA.size, startB: Int = 0, endB: Int = arrB.size
): IntArray {
  val arrC = IntArray((endA - startA) + (endB - startB))
  var idxA = startA
  var idxB = startB
  var idxC = 0
  while (idxA < endA && idxB < endB) {
    if (arrA[idxA] < arrB[idxB]) {
      arrC[idxC++] = arrA[idxA++]
    } else {
      arrC[idxC++] = arrB[idxB++]
    }
  }
  while (idxA < endA) {
    arrC[idxC++] = arrA[idxA++]
  }
  while (idxB < endB) {
    arrC[idxC++] = arrB[idxB++]
  }
  return arrC
}
