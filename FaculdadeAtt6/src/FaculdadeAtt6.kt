import java.util.*

object FaculdadeAtt6 {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        println("Informe seu salário: ")
        val salario = input.nextDouble()
        val r1 = salario + salario * 0.15
        val m1 = salario * 0.15
        val r2 = salario + salario * 0.12
        val m2 = salario * 0.12
        val r3 = salario + salario * 0.10
        val m3 = salario * 0.10
        val r4 = salario + salario * 0.07
        val m4 = salario * 0.07
        val r5 = salario + salario * 0.04
        val m5 = salario * 0.04
        if (salario >= 0.00 && salario <= 400.00) {
            System.out.printf("O novo salário é: " + String.format("%.2f\n", r1))
            System.out.printf("O reajuste ganho foi de: " + String.format("%.2f\n", m1))
            println("Reajuste ganho em percentual: 15% ")
        } else if (salario >= 400.01 && salario <= 800) {
            System.out.printf("O novo salário é: " + String.format("%.2f\n", r2))
            System.out.printf("O reajuste ganho foi de: " + String.format("%.2f\n", m2))
            println("Reajuste ganho em percentual: 12% ")
        } else if (salario >= 800.01 && salario <= 1200) {
            System.out.printf("O novo salário é: " + String.format("%.2f\n", r3))
            System.out.printf("O reajuste ganho foi de: " + String.format("%.2f\n", m3))
            println("Reajuste ganho em percentual: 10% ")
        } else if (salario >= 1200.01 && salario <= 2000) {
            System.out.printf("O novo salário é: " + String.format("%.2f\n", r4))
            System.out.printf("O reajuste ganho foi de: " + String.format("%.2f\n", m4))
            println("Reajuste ganho em percentual: 7% ")
        } else if (salario >= 2000.01) {
            System.out.printf("O novo salário é: " + String.format("%.2f\n", r5))
            System.out.printf("O reajuste ganho foi de:  " + String.format("%.2f\n", m5))
            println("Reajuste ganho em percentual: 4% ")
        }
    }
}