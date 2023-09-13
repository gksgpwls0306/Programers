class Solution {
    fun solution(score: Array<IntArray>): IntArray {
        val students = score.size
        val rank = IntArray(students)
        for (i in rank.indices) {
            rank[i] = 1
        }
        for (i in 0 until students) {
            for (j in 0 until students) {
                if (score[i][0] + score[i][1] < score[j][0] + score[j][1]) {
                    rank[i]++
                }
            }
        }
        return rank
    }
}