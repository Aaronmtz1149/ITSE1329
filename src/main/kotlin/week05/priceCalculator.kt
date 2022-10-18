package week05

/**
 * Aaron Martinez
 * Assignment 05.3
 * October 18, 2022
 */
fun main(){
    print("Enter the original price of the item >> ")
    var price = readln().toDouble()
    print("Enter the markup percentage of the item >> ")
    var markup=readln().toDouble()
    calculateRetail(price,markup)
}
fun calculateRetail(number:Double,percentage:Double){
    var total=number*(1+(percentage/100))
    print(total)
}