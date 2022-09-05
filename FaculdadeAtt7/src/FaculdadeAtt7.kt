import java.util.*

object FaculdadeAtt7 {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        val c1: String
        val c2: String
        val c3: String
        println("Informe a primeira caracteristica: ")
        c1 = input.nextLine()
        println("Informe a segunda caracteristica: ")
        c2 = input.nextLine()
        println("Informe a terceira caracteristica: ")
        c3 = input.nextLine()
        if (c1.equals("vertebrado", ignoreCase = true)) {
            if (c2.equals("ave", ignoreCase = true)) {
                if (c3.equals("carnivoro", ignoreCase = true)) {
                    println("aguia")
                } else {
                    println("pomba")
                }
            } else {
                if (c3.equals("onivoro", ignoreCase = true)) {
                    println("homem")
                } else {
                    println("vaca")
                }
            }
        } else {
            if (c2.equals("inseto", ignoreCase = true)) {
                if (c3.equals("hematofago", ignoreCase = true)) {
                    println("pulga")
                } else {
                    println("lagarta")
                }
            } else {
                if (c3.equals("hematofago", ignoreCase = true)) {
                    println("sanguessuga")
                } else {
                    println("minhoca")
                }
            }
        }
    }
}