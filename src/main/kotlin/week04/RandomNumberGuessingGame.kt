import kotlin.random.Random

/***
 * Aaron Martinez
 * Assignment 04.5 Random Number Guessing Game
 * September 20, 2022
 */
fun main()
{
    var number = Random.nextInt(0,20)
    print("Guess the random number from 0-20 >> ")
    var guess = readln().toInt()
    while(guess!=number)
    {
        if(guess<number)
        {
            print("Too low, try again! >> ")
            guess=readln().toInt()
        }else if(guess>number)
        {
            print("Too high, try again! >> ")
            guess=readln().toInt()
        }
    }
    if(number == guess)
        print("CORRECT!! The random number is $number")
}