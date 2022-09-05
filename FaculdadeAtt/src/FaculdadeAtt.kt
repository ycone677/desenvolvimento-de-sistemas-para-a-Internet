import java.util.*

object FaculdadeAtt {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        val N1: Int
        val N2: Int
        val N3: Int
        val N4: Int
        println("Informe as notas do aluno")
        println("Informe a primeira nota:")
        N1 = input.nextInt()
        println("Informe a segunda nota:")
        N2 = input.nextInt()
        println("Informe a terceira nota:")
        N3 = input.nextInt()
        println("Informe a quarta nota:")
        N4 = input.nextInt()
        var media = ((N1 + N2 + N3 + N4) / 4).toDouble()
        val exame: Double
        if (media >= 7) {
            println("Aluno aprovado " + String.format("%.2f", media))
        } else if (media < 5) {
            println("Aluno reprovado " + String.format("%.2f", media))
        } else if (media <= 5) {
            println("Aluno em exame " + String.format("%.2f", media))
            println("Informe a nota do exame:")
            exame = input.nextDouble()
            media = (media + exame) / 2
            println("Nota do exame:" + String.format("%.2f", media))
        }
        if (media >= 5) {
            println("Aluno aprovado " + String.format("%.2f", media))
        } else {
            println("Aluno reprovado " + String.format("%.2f", media))
        }
        println("Media final " + String.format("%.2f", media))
    }
}