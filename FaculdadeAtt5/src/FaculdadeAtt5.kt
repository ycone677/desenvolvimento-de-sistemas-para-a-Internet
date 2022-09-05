import java.util.*

object FaculdadeAtt5 {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        println("Informe o primeiro número: ")
        val a = input.nextInt()
        println("Informe o segundo número: ")
        val b = input.nextInt()
        if (a % b == 0 || b % a == 0) {
            println("São Multiplos")
        } else {
            println("Não são multiplos")
        }
    }
}