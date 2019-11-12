package algorithms.naive

/**
 * - Finds the maximum subArray sum in the range [low, high] that crosses 'mid'
 * - Returns a Triple that contains <The starting index, The ending index, The maximum sum>
 *
 *  Assumptions:
 *  low <= mid < high
 *
 *  Time Complexity:
 *  - O(|end - start|)
 *
 *  Memory Complexity:
 *  - O(1)
 */
fun maxCrossingSubArray(arr: IntArray, low: Int, mid: Int, high: Int) : Triple<Int, Int, Int>{
  val bestSuffix = maxPrefixSum(arr, mid, low)
  val bestPrefix = maxPrefixSum(arr, mid + 1, high)
  return Triple(bestSuffix.first, bestPrefix.first, bestPrefix.second + bestSuffix.second)
}
