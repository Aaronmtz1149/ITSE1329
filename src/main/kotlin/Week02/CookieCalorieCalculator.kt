fun main()
{
    var cookiesPerBag = 40
    var servingsPerBag = 10
    var caloriesPerServing = 300
    var cookiesPerServing = cookiesPerBag/servingsPerBag
    var caloriesPerBag = servingsPerBag*caloriesPerServing
    var caloriesPerCookie = caloriesPerBag/cookiesPerBag
    print("Enter number of cookies eaten: ")
    var cookiesConsumed = readln().toInt()
    var caloriesConsumed = caloriesPerCookie*cookiesConsumed
    println("Your calorie intake was: $caloriesConsumed calories")
}