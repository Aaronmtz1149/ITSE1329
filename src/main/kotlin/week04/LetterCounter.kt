fun main()
{
    print("Enter a String >> ")
    var word = readln()
    word = word.toUpperCase()
    var letter = readln()
    letter = letter.toUpperCase()
    var count: Int = 0
    for(x in word)
    {
        if(letter==x.toString())
        {
            count++
        }
    }
    print(count)
}