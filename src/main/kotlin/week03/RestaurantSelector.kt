/***
 * Aaron Martinez
 * Assignment 03.7 Restaurant Selector
 * September 19, 2022
 */
fun main()
{
    /*
    Joe’s Gourmet Burgers – Vegetarian: No, Vegan: No, Gluten-Free: No
    Main Street Pizza Com – Vegetarian: Yes, Vegan: No, Gluten-Free: Yes
    Mama’s Fine Italian   – Vegetarian: Yes, Vegan: No, Gluten-Free: No
    The Chef’s Kitchen    – Vegetarian: Yes, Vegan: Yes, Gluten-Free: Yes
    Corner Café –         - Vegetarian: Yes, Vegan: Yes, Gluten-Free: Yes
     */
    val options="Here are your restaurant choices:"
    val joes="Joe's Gourmet Burgers"
    val main="Main Street Pizza Com"
    val corner="Corner Café"
    val mamas="Mama's Fine Italian"
    val the="The Chef's Kitchen"
    /*
        Y N N
        Y Y N
        Y Y Y
        N Y Y
        N N Y
        N N N
        N Y N
        Y N Y
     */
    val YES = "YES"
    println("Type answer \"yes\" or \"no\"")
    print("Is anyone in your party a vegetarian?")
    var veg = readln()
    veg=veg.toUpperCase()
    print("Is anyone in your party a vegan?")
    var vegan=readln()
    vegan=vegan.toUpperCase()
    print("Is anyone in your party gluten-free?")
    var gluten=readln()
    gluten=gluten.toUpperCase()
    println(options)
    if(veg==YES&&vegan!=YES&&gluten!=YES)
    {
        println("$main\n$mamas\n$the\n$corner")
    }
    if(veg==YES&&vegan==YES&&gluten!=YES){
        println("$the\n$corner")
    }
    if(veg==YES&&vegan==YES&&gluten==YES){
        println("$the\n$corner")
    }
    if(veg!=YES&&vegan==YES&&gluten==YES){
        println("$the\n$corner")
    }
    if(veg!=YES&&vegan!=YES&&gluten==YES){
        println("$main\n$the\n$corner")
    }
    if(veg!=YES&&vegan!=YES&&gluten!=YES){
        println("$joes\n$main\n$corner\n$mamas\n$the")
    }
    if(veg!=YES&&vegan==YES&&gluten!=YES){
        println("$corner\n$the")
    }
    if(veg==YES&&vegan!=YES&&gluten==YES){
        println("$main\n$corner\n$the")
    }
}