package week02

/**
 * Aaron M
 * Assignment 02.2 Variables Declaration and Initialization
 * October 20, 2022
 */
//lost old file
fun main(){
    val myAge:Int=22
    var averageAge:Double=30.0
    averageAge=(myAge+averageAge)/2
    println("($myAge + 30)/2=$averageAge")
    var testNumber:Int=49
    var evenOdd=testNumber
    println("testNumber=$testNumber")
    println("evenOdd=$evenOdd")
    testNumber=100
    //evenOdd does not change unless it is assigned to testNumber again
    println("testNumber=$testNumber")
    println("evenOdd=$evenOdd")
    var answer=0
    answer++
    answer+=10
    answer*=10
    println(answer)
}