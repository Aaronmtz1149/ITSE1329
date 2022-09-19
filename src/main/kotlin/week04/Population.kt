/***
 * Aaron Martinez
 * Assignment 04.3 Population
 * September 15, 2022
 */

fun main()
{
    print("Enter the number of starting organisms >> ")
    var parents = readln().toDouble()
    while(parents<2)
    {
        print("Enter the number of starting organisms >> ")
        parents = readln().toDouble()
    }
    print("What is their average daily population increase % >> ")
    var percent = readln().toDouble()/100
    while(percent<0)
    {
        print("What is their average daily population increase % >> ")
        percent = readln().toDouble()/100
    }
    print("How many days would you like to calculate >> ")
    var days = readln().toDouble()
    while(days<1)
    {
        print("How many days would you like to calculate >> ")
        days = readln().toDouble()
    }
    var total = parents
    for(x in 1..days.toInt())
    {
        total *= (1+percent)
        println("After Day $x: $total organisms")
    }
}