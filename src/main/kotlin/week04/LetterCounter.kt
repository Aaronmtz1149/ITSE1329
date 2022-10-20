fun main()
{
    print("Enter a String >> ")
    var word = readln()
    word = word.toUpperCase()
    print("Enter a character you want to count >> ")
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