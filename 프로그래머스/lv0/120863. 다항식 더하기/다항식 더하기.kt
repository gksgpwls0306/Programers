class Solution {
    fun solution(polynomial: String): String {
        val counter = mutableListOf(0, 0)
        for (each in polynomial.split(" + "))
            if (each[each.length - 1] == 'x')
                counter[0] += if (each.length == 1) 1 else each.slice(0..(each.length - 2)).toInt()
            else
                counter[1] += each.toInt()
        val result = mutableListOf<String>()
        if (counter[0] > 0)
            result.add("${if (counter[0] == 1) "" else counter[0]}x")
        if (counter[1] > 0)
            result.add("${counter[1]}")
        return result.joinToString(" + ")
    }
}