package week09
fun main(){
    myCode(90)
    myOtherCode()
    info("AARON",22)
    println(sum(3,5))
}
fun myCode(x:Int){
    println(x)
}
fun myOtherCode(){
    println("This is another message brought to you by REDBULL!!")
}
fun info(name:String, age:Int){
    println("My name is $name, I am $age years old!")
}
fun sum(x: Int, y: Int): Int {
    return x + y
}