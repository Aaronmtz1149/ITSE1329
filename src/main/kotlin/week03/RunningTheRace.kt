fun main()
{
    print("Enter the name of runner #1 >> ")
    var runner1: String = readln()
    print("How many minutes until finish line was crossed? >> ")
    var time1: Int = readln().toInt()
    print("Enter the name of runner #2 >> ")
    var runner2: String = readln()
    print("How many minutes until finish line was crossed? >> ")
    var time2: Int = readln().toInt()
    print("Enter the name of runner #3 >> ")
    var runner3: String = readln()
    print("How many minutes until finish line was crossed? >> ")
    var time3: Int = readln().toInt()

    if(time1 > time2 && time1 > time3)
    {
        if(time2>time3)
        {
            println("In 1st place Runner #3, $runner3 with a finish time of $time3 minutes.")
            println("in 2nd place Runner #2, $runner2 with a finish time of $time2 minutes.")
            println("In 3rd place Runner #1, $runner1 with a finish time of $time1 minutes.")
        }else
        {
            println("In 1st place Runner #2, $runner2 with a finish time of $time2 minutes ")
            println("in 2nd place Runner #3, $runner3 with a finish time of $time3 minutes.")
            println("In 3rd place Runner #1, $runner1 with a finish time of $time1 minutes.")
        }
    }else if(time2>time1 && time2>time3)
    {
        if(time1>time3)
        {
            println("In 1st place Runner #3, $runner3 with a finish time of $time3 minutes.")
            println("in 2nd place Runner #1, $runner1 with a finish time of $time1 minutes.")
            println("In 3rd place Runner #2, $runner2 with a finish time of $time2 minutes.")
        }else
        {
            println("In 1st place Runner #1, $runner1 with a finish time of $time1 minutes.")
            println("in 2nd place Runner #3, $runner3 with a finish time of $time3 minutes.")
            println("In 3rd place Runner #2, $runner2 with a finish time of $time2 minutes.")
        }
    }else if(time3>time2 && time3>time1)
    {
        if(time1>time2)
        {
            println("In 1st place Runner #2, $runner2 with a finish time of $time2 minutes.")
            println("in 2nd place Runner #1, $runner1 with a finish time of $time1 minutes.")
            println("In 3rd place Runner #3, $runner3 with a finish time of $time3 minutes.")
        }else
        {
            println("In 1st place Runner #1, $runner1 with a finish time of $time1 minutes.")
            println("in 2nd place Runner #2, $runner2 with a finish time of $time2 minutes.")
            println("In 3rd place Runner #3, $runner3 with a finish time of $time3 minutes.")
        }
    }

/*
Display "Enter name of runner # 1 >> "

 */
}