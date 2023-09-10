fun main(args: Array<String>) {
    val (n) = readLine()!!.split(' ').map(String::toInt)
    for(i in 0 until n){
        for(j in 0..i){
            print("*")
        }
        println("")
    }
    // println(n)
}