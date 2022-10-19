package week05

/**
 * Aaron M
 * Assignment 05.5 Celsius Temperature Table
 * October 19, 2022
 */
fun main(){
    celsius(20)
}
fun celsius(f:Int){
    for(x in 1..f){
        var celsius=(5.0/9)*(x-32)
        println("$x degrees Farenheit is $celsius degrees Celsius")
    }
}