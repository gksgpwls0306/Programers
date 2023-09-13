class Solution {
    fun solution(lines: Array<IntArray>): Int {
            var answer: Int = 0

            val a = lines[0][0] until lines[0][1]
            val b = lines[1][0] until lines[1][1]
            val c = lines[2][0] until lines[2][1]

            val ab = a.intersect(b)
            val bc = b.intersect(c)
            val ac = a.intersect(c)

            answer = ab.union(bc).union(ac).size
            return answer
        }
    }