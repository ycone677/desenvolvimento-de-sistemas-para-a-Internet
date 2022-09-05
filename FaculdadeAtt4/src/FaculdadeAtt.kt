import java.util.*

object FacultadeAtt {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        val a: Double
        val b: Double
        val c: Double
        val perimetro: Double
        val area: Double
        println("Informe o primeiro valor:")
        a = input.nextDouble()
        println("Informe o segundo valor nota:")
        b = input.nextDouble()
        println("Informe a terceira nota:")
        c = input.nextDouble()
        perimetro = a + b + c
        area = (a + b) * c / 2
        println("perimetro = " + String.format("%.2f", perimetro))
        println("area = " + String.format("%.2f", area))
    }
}