import java.io.File

class Burguer: Food() {
    override val name: String = "Pasada de Burguer"
    override var price: Float = 100f
    val fileName = "src/Instruccions/Burguer.txt"


    override fun cook() {
        val fileContent: String = File(fileName).readText()
        println(fileContent)
    }

}