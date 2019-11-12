package algorithms.naive

/**
 * - Finds the maximum prefix sum in the range [start, end] of the array 'arr'
 * - Returns a pair that contains <The best Index for that sum, The Maximum Sum>
 *
 *  Assumptions:
 *  - If 'start' is less than 'end'.. then it finds the maximum prefix sum.
 *  - Otherwise it finds the maximum prefix sum.
 *
 *  Time Complexity:
 *  - O(|end - start|)
 *
 *  Memory Complexity:
 *  - O(1)
 */
fun maxPrefixSum(arr: IntArray, start: Int, end: Int): Pair<Int, Int> {
  val loopRange = if (start <= end) (start..end) else (start downTo end)

  var bestSum = Int.MIN_VALUE
  var sum = 0
  var bestIndex = start

  for (i in loopRange) {
    sum += arr[i]
    if (sum > bestSum) {
      bestSum = sum
      bestIndex = i
    }
  }

  return Pair(bestIndex, bestSum)
}