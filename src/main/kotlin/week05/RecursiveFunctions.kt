package week05

/**
 * Assignment 05.2 Recursive Functions
 * October 18, 2022
 */
fun main(){
    print("Enter an integer >> ")
    var number=readln().toInt()
println("fibonacci($number)==${fibonacci(number)}")
}
fun fibonacci(number:Int):Int{
    var x=0
    when{
        number<=0-> x=0
        number<=2-> x= 1
        number>2-> x= fibonacci(number-1)+ fibonacci(number-2)
    }
    return x
}
