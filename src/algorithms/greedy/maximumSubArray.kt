package algorithms.greedy

/**
 * Greedy solution for the Maximum sub-array sum problem
 * AKA => Kadane's Algorithm
 *
 * - Returns a Triple that contains <The starting index, The ending index, The maximum sum>
 *
 *  Assumptions:
 *  low <= high < arr.size
 *
 *  Time Complexity:
 *  - O(n)
 *
 *  Memory Complexity:
 *  - O(1)
 */

fun maximumSubArray(arr: IntArray, low: Int, high: Int): Triple<Int, Int, Int> {
  var bestLow = low
  var bestHigh = low
  var bestSum = arr[low]
  var sum = 0
  var l = low
  for (r in low..high) {
    sum += arr[r]
    if (sum >= bestSum) {
      bestLow = l
      bestHigh = r
      bestSum = sum
    }
    if (sum < 0) {
      sum = 0
      l = r + 1
    }
  }
  return Triple(bestLow, bestHigh, bestSum)
}
