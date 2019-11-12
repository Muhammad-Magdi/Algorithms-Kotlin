package algorithms.bruteForce

/**
 * BruteForce solution for the Maximum sub-array sum problem
 *
 * - Returns a Triple that contains <The starting index, The ending index, The maximum sum>
 *
 *  Assumptions:
 *  low <= high < arr.size
 *
 *  Time Complexity:
 *  - O(n^2)
 *
 *  Memory Complexity:
 *  - O(1)
 */

fun maximumSubArray(arr: IntArray, low: Int, high: Int): Triple<Int, Int, Int> {
  var bestLow = low
  var bestHigh = low
  var bestSum = arr[low]
  for (l in low..high) {
    var sum = 0
    for (r in l..high) {
      sum += arr[r]
      if (sum >= bestSum) {
        bestLow = l
        bestHigh = r
        bestSum = sum
      }
    }
  }
  return Triple(bestLow, bestHigh, bestSum)
}
