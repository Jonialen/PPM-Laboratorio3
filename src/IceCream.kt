import java.io.File

class IceCream: Food(), Dessert {
    override val name: String = "Heladin"
    override var price: Float = 10f
    val cooler = "src/Instruccions/IceCreamCooler.txt"
    val eat = "src/Instruccions/IceCreamEat.txt"



    override fun cook() {
        val fileContent: String = File(cooler).readText()
        println(fileContent)
    }

    override fun eat(){
        val fileContent: String = File(eat).readText()
        println(fileContent)
    }
}