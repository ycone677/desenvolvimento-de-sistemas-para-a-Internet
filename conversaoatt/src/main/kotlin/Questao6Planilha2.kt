object Questao6Planilha2 {
    @JvmStatic
    fun main(args: Array<String>) {
        for (i in 100..200) {
            if (i % 2 != 0) {
                println("Os números ímpares de entre 100 e 200 são: $i")
            }
        }
    }
}