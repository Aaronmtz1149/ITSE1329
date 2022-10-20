package week05

/**
 * Aaron Martinez
 * Assignment 05.3
 * October 18, 2022
 */
    var markup=0.0
    var price=0.0
fun main(){
    print("Enter the original price of the item >> ")
    price = readln().toDouble()
    print("Enter the markup percentage of the item >> ")
    markup=readln().toDouble()
    calculateRetail(price,markup)
}
fun calculateRetail(number:Double,percentage:Double){
    var total=number*(1+(percentage/100))
    println("The markup price of $price is $$total")
}