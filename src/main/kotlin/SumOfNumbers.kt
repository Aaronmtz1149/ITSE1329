fun main()
{
    print("Enter a positive integer >> ")
    var number: Int = readln().toInt()
    var counter: Int = 0
    var total: Int = 0
    while(counter<=number)
    {
        total+=counter
        counter++
    }
    println(total)
//testing
}