class Questao1Planilha2 {
    object Planilha2 {
        @JvmStatic
        fun main(args: Array<String>) {
            var i = 3
            while (i <= 500) {
                if (i % 2 != 0) {
                    println(i)
                } else {
                    println()
                }
                i = i + 3
            }
        }
    }


}