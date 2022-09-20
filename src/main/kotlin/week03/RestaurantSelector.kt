/***
 * Aaron Martinez
 * Assignment 03.7 Restaurant Selector
 * September 19, 2022
 */
fun main()
{
    /*
    Joe’s Gourmet Burgers – Vegetarian: No, Vegan: No, Gluten-Free: No
    Main Street Pizza Company – Vegetarian: Yes, Vegan: No, Gluten-Free: Yes
    Corner Café – Vegetarian: Yes, Vegan: Yes, Gluten-Free: Yes
    Mama’s Fine Italian – Vegetarian: Yes, Vegan: No, Gluten-Free: No
    The Chef’s Kitchen – Vegetarian: Yes, Vegan: Yes, Gluten-Free: Yes
     */
    val YES = "YES"
    print("Is anyone in your party a vegetarian?")
    var veg = readln()
    veg=veg.toUpperCase()
    print("Is anyone in your party a vegan?")
    var vegan=readln()
    vegan=vegan.toUpperCase()
    print("Is anyone in your party gluten-free?")
    var gluten=readln()
    gluten=gluten.toUpperCase()
    if(veg==YES)
    {
        if(vegan==YES&&gluten==YES)
        {
            println("Corner Café\nThe Chef’s Kitchen")
        }else(gluten!=YES&&vegan==YES)
        {

        }
    }

}