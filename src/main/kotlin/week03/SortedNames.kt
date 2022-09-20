fun main()
{
    print("Enter the first name >> ")
    var name1 = readln()
    print("Enter the second name >> ")
    var name2 = readln()
    print("Enter the third name >> ")
    var name3 = readln()

    //using arrays...
    /*var names = arrayOf(name1,name2,name3)
    names.sort()
    for(name in names)
    {
        println(name)
    }*/

    if(name1.compareTo(name2)<name2.compareTo(name1)&&name1.compareTo(name3)<name3.compareTo(name1))
    {
        if(name2.compareTo(name3)<name3.compareTo(name2))
        {
            println("These are the names listed in alphabetical order: ")
            println(name1)
            println(name2)
            println(name3)
        }else
        {
            println("These are the names listed in alphabetical order: ")
            println(name1)
            println(name3)
            println(name2)
        }
    }else if(name2.compareTo(name1)<name1.compareTo(name2)&&name2.compareTo(name3)<name3.compareTo(name2))
    {
        if(name1.compareTo(name3)<name3.compareTo(name1))
        {
            println("These are the names listed in alphabetical order: ")
            println(name2)
            println(name1)
            println(name3)
        }else
        {
            println("These are the names listed in alphabetical order: ")
            println(name2)
            println(name3)
            println(name1)
        }
    }else if(name3.compareTo(name1)<name1.compareTo(name3)&&name3.compareTo(name2)<name2.compareTo(name3))
    {
        if(name2.compareTo(name1)<name1.compareTo(name2))
        {
            println("These are the names listed in alphabetical order: ")
            println(name3)
            println(name2)
            println(name1)
        }else
        {
            println("These are the names listed in alphabetical order: ")
            println(name3)
            println(name1)
            println(name2)
        }
    }

}