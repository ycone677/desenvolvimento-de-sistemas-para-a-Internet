object TesteT {
    @JvmStatic
    fun main(args: Array<String>) {
        for (i in 0..10) {
            for (j in 0..10) {
                println("$i x $j = $i" * j)
            }
        }
    }
}