//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    fun Food.discountedPrice(percent: Double): Double{
        return this.price * (1-(percent/100))
    }
    val burguer1: Burguer = Burguer()
    val pizza1: Pizza = Pizza()
    val iceCream1: IceCream = IceCream()
    val juice1: Juice = Juice()

    printEsencialData(burguer1)
    println("Q${burguer1.discountedPrice(10.0)}")
    println("\n")

    printEsencialData(pizza1)
    println("\n")

    printEsencialData(iceCream1)
    iceCream1.eat()
    println("\n")

    printEsencialData(juice1)
    juice1.pour()
    println("\n")

}

fun printEsencialData(food: Food) {
    println("${food.name}, Q${food.price}")
    food.cook()
}