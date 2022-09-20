fun main()
{
    print("Enter a number from 1-10 >> ")
    var number = readln().toInt()
    print("$number in Roman Numerals is: ")
    if(number in 1..3)
    {
        print("I".repeat(number))
    }else if(number == 4)
    {
        println("IV")
    }else if(number==5)
    {
        println("V")
    }else if(number in 6..8)
    {
        println("V" + "I".repeat(number-5))
    }else if(number==10)
    {
        print("X")
    }else if(number == 9)
    {
        println("IX")
    }else
    {
        println("Error: Your number is out of range!!")
    }
}