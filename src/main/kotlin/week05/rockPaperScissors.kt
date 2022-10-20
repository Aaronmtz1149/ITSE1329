package week05

import kotlin.random.Random

/**
 * Aaron M
 * Assignment 05.7 Rock Paper Scissors Game
 * October 19, 2022
 */
var answer:Int=0
var botAnswer:Int=0
var botChoice=""
var choice:String=""
var options= arrayOf("Rock","Paper","Scissors")

fun main(){
    userChooses()
    botChooses()
    print("Bot chose $botAnswer - $botChoice and you chose $answer - $choice")
}
fun userChooses(){
    print("Enter your choice (1-3):\n(1). Rock\n(2). Paper\n(3). Scissors\n")
    answer=readln().toInt()
    choice= options[answer-1]
}
fun botChooses(){
    //import Random class
    botAnswer= Random.nextInt(1,3)
    botChoice=options[botAnswer-1]
    while(botAnswer == answer){
        println("It's a tie!! Try again!")
        userChooses()
        botAnswer= Random.nextInt(1,3)
        botChoice=options[botAnswer-1]
    }
    if((botAnswer==1&&answer==2)||(botAnswer==2&&answer==3)||(botAnswer==3&&answer==1)){
        println("You win! $choice beats $botChoice")
    }else println("You lose! $botChoice beats $choice")

}