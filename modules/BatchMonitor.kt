class SecureCollector(private val state: Int = 81) {
    fun load(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 81) % 997
        }
        return acc
    }
}

fun main() {
    println(SecureCollector().load(81))
}
