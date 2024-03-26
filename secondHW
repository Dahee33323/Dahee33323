fun main(args: Array<String>) {
    val n = readln().toInt()
    val gradings = ArrayList<Grading>()
    repeat(n) {
        val (no, kor, eng) = readln().split(" ").map { it }
        val tot = kor.toInt() + eng.toInt()
        val avg = tot.toInt().div(2)
        val point = if(avg >= 90) 'A'
        else if(avg >= 80) 'B'
        else if(avg >= 70) 'C'
        else if(avg >= 60) 'D'
        else 'F'
        val rank = 1
        gradings.add(Grading(no, kor, eng, tot, avg, point, rank))
    }
    val message = """*************성적표*************
                    |학번  국어  영어  총점  평균  학점  등수""".trimMargin()
    println(message)
    for(i in 0 until 3) {
        println(gradings[i].no+"   "+gradings[i].kor+"   "+gradings[i].eng+"   "+gradings[i].tot+"   "+gradings[i].avg+"   "+gradings[i].point+"   "+gradings[i].rank)
    }
}
data class Grading(val no: String, val kor: String, val eng: String, val tot: Int, val avg: Int, val point: Char, val rank: Int)
