package week05

/**
 * Assignment 05.1 Prime Time
 * October 18, 2022
 */
fun main(){
    print("Enter an integer to check if it's prime >> ")
    var number= readln().toInt()
    isPrime(number)
}
fun isDiv(number:Int):Boolean{
    var bool= false
    for(x in 2..number/2){
        if(number%x==0) {
            bool = true
            break
        }
    }
    return bool
}
fun isPrime(number:Int){
    if(!isDiv(number)){
        println("$number is prime!")
    }else println("$number is not prime.")
}