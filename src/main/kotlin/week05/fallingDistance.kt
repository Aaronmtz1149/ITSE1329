package week05

/**
 * Aaron M
 * Assignment 05.4 Falling Distance
 * October 19, 2022
 */
fun main(){

    fallingDistance(1)
    fallingForSeconds(10)
}
fun fallingDistance(seconds:Int){
    val g:Double=9.8
    var distance=0.5*(g*(seconds*seconds))
    println("In $seconds second(s), the object has fallen $distance meters!")
}
fun fallingForSeconds(seconds:Int){
    val g:Double=9.8
    var distance=0.0
    for(x in 1..seconds){
        distance=0.5*(g*(x*x))
        println("In $x second(s), the object has fallen $distance meters!")
    }
}