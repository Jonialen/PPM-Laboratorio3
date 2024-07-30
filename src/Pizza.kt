import java.io.File

class Pizza: Food() {
    override val name: String = "Pequeño cesar"
    override var price: Float = 45f
    val fileName = "src/Instruccions/Pizza.txt"


    override fun cook() {
        val fileContent: String = File(fileName).readText()
        println(fileContent)
    }

}