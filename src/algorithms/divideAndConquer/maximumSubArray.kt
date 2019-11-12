package algorithms.divideAndConquer

import algorithms.naive.maxCrossingSubArray

fun maximumSubArray(arr: IntArray, low: Int, high: Int): Triple<Int, Int, Int> {
  //Base Case
  if (low == high)
    return Triple(low, high, arr[low])

  //Divide
  val mid = (low + high) / 2

  //Conquer
  val (leftLow, leftHigh, leftSum) = maximumSubArray(arr, low, mid)
  val (rightLow, rightHigh, rightSum) = maximumSubArray(arr, mid + 1, high)

  //Combine
  val (crossLow, crossHigh, crossSum) = maxCrossingSubArray(arr, low, mid, high)
  if (leftSum >= rightSum && leftSum >= crossSum)
    return Triple(leftLow, leftHigh, leftSum)
  else if (rightSum >= leftSum && rightSum >= crossSum)
    return Triple(rightLow, rightHigh, rightSum)
  else
    return Triple(crossLow, crossHigh, crossSum)
}