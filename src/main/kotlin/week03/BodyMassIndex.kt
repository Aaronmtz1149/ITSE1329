fun main()
{
    print("Enter your weight in pounds >> ")
    var weight = readln().toDouble()
    print("Enter your height in inches >> ")
    var height = readln().toDouble()
    var bmi = (weight) * (703/(height * height))

    println("Your BMI is $bmi")
    when
    {
        bmi < 18.5 -> println("You are underweight.")
        bmi < 25 -> println("You are at you optimal weight")
        bmi >= 25 -> println("You are overweight.")
    }
}













