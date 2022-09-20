fun main()
{
    print("Enter the object's mass in kg >> ")
    var mass = readln().toInt()
    var weight = mass * 9.8
    when
    {
        weight < 10 -> println("The object is too light")
        weight <= 1000 -> println("The object with mass of $mass kg is $weight N")
        weight > 1000 -> println("The object is too heavy")
    }
}