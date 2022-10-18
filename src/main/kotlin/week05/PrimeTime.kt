package week05

/**
 * Assignment 05.1 Prime Time
 * October 18, 2022
 */
fun main(){
    print("Enter a number >> ")
    var number= readln().toInt()
    print("Enter a divisor >> ")
    var divisor=readln().toInt()
    if(isNumberDivisible(number,divisor)){
        println("$number is divisible by $divisor")
    }else println("$number is not divisible by $divisor")

    isPrime(number)
}
fun isNumberDivisible(number:Int, divisor:Int):Boolean{
    return number%divisor==0
}
fun isPrime(number:Int){
    var bool=false
    for(x in 2..number/2){
        if(number%x==0) {
            bool = true
            break
        }
    }
    if(!bool){
        println("$number is prime!")
    }else println("$number is not prime.")
}