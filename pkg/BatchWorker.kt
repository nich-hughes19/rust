class HybridCache(private val state: Int = 90) {
    fun build(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 90) % 997
        }
        return acc
    }
}

fun main() {
    println(HybridCache().build(90))
}
