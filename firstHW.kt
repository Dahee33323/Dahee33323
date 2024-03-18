// https://kmhan.tistory.com/m/24
package com.example.myapplication

// 1
/*fun main() {
    println("**************************성적표**************************")
    println("학번\t국어\t영어\t총점\t평균\t학점\t등수")
    println("---------------------------------------------------------")
    println("1\t98\t90\t188\t94\tA\t1")
}
*/

// 2
/*
fun main() {
    val no = 1
    val kor = 98
    val eng = 90
    val tot = kor+eng
    val avg = tot/2
    val point = 'A'
    val rank = 1
    println("**************************성적표**************************")
    println("학번\t국어\t영어\t총점\t평균\t학점\t등수")
    println("---------------------------------------------------------")
    println("$no\t$kor\t$eng\t$tot\t$avg\t$point\t$rank")
}
*/

// 3
fun main() {
    val no = 1
    val kor = 98
    val eng = 90
    val rank = 1

    val tot: Int = kor + eng
    val avg: Int = tot/2

    /*
    if(avg>=90) point = 'A'
    else if(avg>=80) point = 'B'
    else if(avg>=70) point = 'C'
    else if(avg>=60) point = 'D'
    else point = 'F'
    */
    val point: Char = when(avg) {
        90 -> 'A'
        80 -> 'B'
        70 -> 'C'
        60 -> 'D'
        else -> 'F'
    } 
    println("**************************성적표**************************")
    println("학번\t국어\t영어\t총점\t평균\t학점\t등수")
    println("---------------------------------------------------------")
    println("$no\t$kor\t$eng\t$tot\t$avg\t$point\t$rank")

}

// 3 
fun main() {
    val no= 1
    val kor : Int
    kor = 78
    val eng = 90;
    val total = kor.plus(eng)
    val avg = total.div(2)
    val grade = 'A'
    
    val rank : Char
    
    rank = if (avg >= 90) 'A'
    else if (avg >= 80) 'B'
    else if (avg >= 70) 'C'
    else if (avg >= 60) 'D'
    else 'E'
    
    val message = """*************************성적표*************************
  					|학번	국어	영어	총점	평균	학점	등수
  					|$no	$kor	$eng	$total	$avg	$grade	$rank""".trimMargin()
    
    println(message+"\n")
    val comment = """trimMargin의 기본 문자열은 '|', 이걸 기준으로 공백이 제거됨"""
    println(comment)
}

