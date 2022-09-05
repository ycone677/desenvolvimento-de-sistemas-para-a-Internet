import java.util.*

object FaculdadeAtt10 {
    @JvmStatic
    fun main(args: Array<String>) {
        val entrada = Scanner(System.`in`)
        val num = entrada.nextInt()
        var i = 1
        while (i <= num) {
            println(i)
            i = i + 2
        }
    }
}