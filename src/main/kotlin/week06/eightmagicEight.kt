package week06

import java.io.File
import java.io.InputStream
import kotlin.random.Random
import kotlin.system.exitProcess

/**
 * Aaron M.
 * Assignment 06.2 Magic 8 Ball
 * October 30, 2022
 */
fun main(args: Array<String>) {
    val inputStream: InputStream = File("/Users/aaronstrapbook/Downloads/8ball.txt").inputStream()
    val lineList = mutableListOf<String>()
    var quit = "quit"
    var out1 = "Ask anything to \"THE\" Magic 8 Ball!"
    var out2 = "Ask something else to \"THE\" Magic 8 Ball!"

    inputStream.bufferedReader().forEachLine { lineList.add(it) }
    var input=readLine().toString()
    println(out1)
//    lineList.forEach{println(">  " + it)}

    while(input != quit){
        input=input.toLowerCase()
        if(input==quit){
            exitProcess(0)
        }
        println(lineList[random()])
        println(out2)
        input= readLine().toString().toLowerCase()
        println(lineList[random()])
    }

}
fun random(): Int {
    return Random.nextInt(0, 10)
}
