import javax.swing.JOptionPane

object Questao4Planilha2 {
    @JvmStatic
    fun main(args: Array<String>) {
        var numero = 0
        var quantidade1 = 0
        var quantidade2 = 0
        var quantidade3 = 0
        var quantidade4 = 0
        var quantidadeForaDoIntervalo = 0
        while (numero != -1) {
            println("Informe um numero")
            numero = JOptionPane.showInputDialog("Informe um numero").toInt()
            if (numero <= 0 || numero > 100) {
                quantidadeForaDoIntervalo = quantidadeForaDoIntervalo + 1
            } else {
                if (numero >= 0 && numero <= 25) {
                    quantidade1 = quantidade1 + 1
                }
                if (numero >= 26 && numero <= 50) {
                    quantidade2 = quantidade2 + 1
                }
                if (numero >= 51 && numero <= 75) {
                    quantidade3 = quantidade3 + 1
                }
                if (numero >= 76 && numero <= 100) {
                    quantidade4 = quantidade4 + 1
                }
            }
        }
        println("Quantidade de números no intervalo de 0 a 25, é de $quantidade1")
        println("Quantidade de números no intervalo de 25 a 50, é de $quantidade2")
        println("Quantidade de números no intervalo de 50 a 75, é de $quantidade3")
        println("Quantidade de números no intervalo de 75 a 100, é de $quantidade4")
        println("Quantidade de números fora do intervalo, é de$quantidadeForaDoIntervalo")
    }
}