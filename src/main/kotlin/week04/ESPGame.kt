import kotlin.random.Random

/***
 * Aaron Martinez
 * Assignment 04.6 ESP Game
 * September 20, 2022
 */
fun main()
{
    var colors = arrayOf("Red", "Green","Blue","Orange","Yellow")
    var rand = Random.nextInt(0,4)
    var color = colors[rand].toUpperCase()
    var score = 0
    for(x in 1..10)
    {
        for(i in colors)
        {
            print("$i\t")
        }
        println()
        print("Guess the color >> ")
        var guess = readln().toUpperCase()
        if(color == guess)
            score++
        println("Color: $color\tYour guess: $guess Score: $score")
        println()
        rand = Random.nextInt(0,4)
        color = colors[rand].toUpperCase()
    }
}