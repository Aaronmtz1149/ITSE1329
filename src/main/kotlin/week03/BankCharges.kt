/***
 * Aaron Martinez
 * Assignment 03.8 Bank Charges
 * September 19, 2022
 */
fun main()
{
    val MONTHLY_FEE = 10
    var total = 0.0
    print("Enter the number of checks written for this month >> ")
    var checks = readln().toDouble()
    when{
        checks<20->total=MONTHLY_FEE+checks*0.1
        checks<40->total=MONTHLY_FEE+checks*0.08
        checks<60->total=MONTHLY_FEE+checks*0.06
        checks>=60->total=MONTHLY_FEE+checks*0.04
    }
    print("Banks initial fee $$MONTHLY_FEE\nChecks: $checks\nTotal: $$total")
}