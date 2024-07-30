import java.io.File

class Juice: Drink() {
    override val name: String = "Sipi"
    override var price: Float = 10f
    val cookJuice = "src/Instruccions/JuiceCook.txt"
    val pourJuice = "src/Instruccions/JuicePour.txt"

    override fun cook() {
        val fileContent: String = File(cookJuice).readText()
        println(fileContent)
    }

    override fun pour() {
        val fileContent: String = File(pourJuice).readText()
        println(fileContent)
    }
}