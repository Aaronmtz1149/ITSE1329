import java.lang.Math;
import kotlin.math.pow

fun main()
{
    print("Enter the original deposit amount >> $")
    var P = readln().toDouble()
    print("Enter the annual interest rate >> ")
    var rate = readln().toDouble()
    var ratePercent = rate/100
    print("How many times per year will the interest compound >> ")
    var n = readln().toDouble()
    print("How many years do you want to accumulate interest for? >> ")
    var years = readln().toDouble()
    var power = n*years
    var a = P * ((1 + (ratePercent / n)).pow((n*years)))
    if(n==4.0)
    {
        println("With a principal $$P deposit and a quarterly rate interest compound of $ratePercent%,\nthe accumulated amount at the end of $years years is $$a")
    }else if(n==12.0)
    {
        println("With a principal $$P deposit and a monthly rate interest compound of $ratePercent%,\nthe accumulated amount at the end of $years years is $$a")
    }else{
        print("Invalid entry.\nYou must enter 12 for monthly\nor 4 for quarterly")
    }

}
//"With a principal $$P deposit and a quarterly rate interest compound of $ratePercent%, the accumulated amount at the end of $years years is $$a"