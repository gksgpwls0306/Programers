class Solution {
    fun solution(denum1: Int, num1: Int, denum2: Int, num2: Int): IntArray {
    val denum3 = (num1 * denum2) + (num2 * denum1)
    val num3 = num1 * num2
    var min = 1 // 최소 공배수

    for (i in min..denum3) {
        if (denum3 % i == 0 && num3 % i == 0) {
            min = i
        }
    }
    val answer: IntArray = intArrayOf(denum3 / min, num3 / min)
    return answer
}
}