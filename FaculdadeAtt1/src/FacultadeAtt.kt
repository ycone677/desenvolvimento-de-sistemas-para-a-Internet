import java.util.*

object FacultadeAtt {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        val codigo: Int
        val quantidade: Int
        val total: Double
        println("Informe o código do produto:")
        codigo = input.nextInt()
        println("Informe a quantidade do produto")
        quantidade = input.nextInt()
        if (codigo == 1) {
            total = quantidade * 4.00
            println("Total: R$ " + String.format("%.2f", total))
        } else if (codigo == 2) {
            total = quantidade * 4.50
            println("Total: R$ " + String.format("%.2f", total))
        } else if (codigo == 3) {
            total = quantidade * 5.00
            println("Total: R$ " + String.format("%.2f", total))
        } else if (codigo == 4) {
            total = quantidade * 2.00
            println("Total: R$ " + String.format("%.2f", total))
        } else {
            total = quantidade * 1.50
            println("Total: R$ " + String.format("%.2f", total))
        }
    }
}