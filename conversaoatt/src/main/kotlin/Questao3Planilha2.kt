import java.util.*

object Questao3Planilha2 {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        var media = 0.0
        var np = 0
        var nn = 0
        while (input.hasNext()) {
            val n = input.nextInt()
            if (n == 0) break
            media += n.toDouble()
            if (n > 0) np++
            if (n < 0) nn++
        }
        val n = np + nn
        System.out.printf("Media: %f%n", media / (np + nn))
        System.out.printf("Positivos:  %d (%.0f%%)%n", np, 100.0 * np / n)
        System.out.printf("Negativos:  %d (%.0f%%)%n", nn, 100.0 * np / n)
    }
}