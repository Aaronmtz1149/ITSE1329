fun main()
{
    var count: Int = 0
    print("Enter your favorite city >> ")
    var input = readln();
    var firstLetter = input[0]
    for(x in input)
    {
        count++
        println(x)
    }
    println("There are $count characters in $input")
    println(input.toUpperCase())
    println(input.toLowerCase())
    println("The first character in $input is $firstLetter")

}