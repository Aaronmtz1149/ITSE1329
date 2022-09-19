/***
 * Aaron Martinez
 * Assignment 04.4 Bar Chart
 * September 15, 2022
 */
fun main()
{
    var storesArr = arrayOf(1,2,3,4,5)
    var salesArray = arrayOf(0,0,0,0,0)
    for ((i, x) in salesArray.withIndex())
    {
        print("Enter today's sales for store "+storesArr[i] +": $")
        salesArray[i]=readln().toInt()
    }
    //SALES BAR CHART
    var asterisks = "*"
    println("SALES BAR CHART")
    var stars = arrayOf(salesArray[0]/100,salesArray[1]/100,salesArray[2]/100,salesArray[3]/100,salesArray[4]/100)
    for ((i,x) in salesArray.withIndex())
    {
        println("Store " + storesArr[i] +": "+ asterisks.repeat(stars[i]))
    }
}