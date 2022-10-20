package week05

import kotlin.random.Random

/**
 * Aaron M
 * Assignment 05.7 Rock Paper Scissors Game
 * October 19, 2022
 */
var botAnswer:Int=0
var botChoice=""
var choice:String=""
var options= arrayOf("rock","paper","scissors")

fun main(){
    userChooses()
    botChooses()
}
fun userChooses(){
    println("Enter your choice:\n(1). Rock\n(2). Paper\n(3). Scissors\n")
    choice=readln().toLowerCase()
}
fun botChooses() {
    //import Random class
    botAnswer = Random.nextInt(1, 3)
    botChoice = options[botAnswer - 1]
    while (botChoice == choice) {
        println("It's a tie!! Try again!")
        println("You chose $choice and bot chose $botChoice")
        userChooses()
        botAnswer = Random.nextInt(0, 3)
        botChoice = options[botAnswer]
    }
    if ((botChoice == options[0] && choice == options[1]) || (botChoice == options[1] && choice == options[2]) || (botChoice == options[2] && choice == options[0])) {
        println("You win! $choice beats $botChoice")
        print("You chose $choice and bot chose $botChoice")
    } else
        if ((botChoice == options[0] && choice == options[2]) || (botChoice == options[1] && choice == options[0]) || (botChoice == options[2] && choice == options[1])) {
            println("You lose! $botChoice beats $choice")
            print("Bot chose $botChoice and you chose $choice")
        } else
            println("Invalid entry!! Try again")

    }