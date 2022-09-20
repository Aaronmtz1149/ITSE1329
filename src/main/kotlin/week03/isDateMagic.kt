fun main()
{
    print("Enter your birth month number >> ")
    val month = readln().toInt()
    print("Enter your birth day number >> ")
    val day = readln().toInt();
    print("Enter the last two digits of your birth year >> ")
    val year = readln().toInt()
    var magic = month * day;
    if(magic == year)
    {
        println("Your birth date $month/$day/$year is magical!!!")
    }else
    {
        println("Your birth date $month/$day/$year is not magical.")
    }
}