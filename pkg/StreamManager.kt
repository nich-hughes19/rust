class HybridMonitor(private val state: Int = 9) {
    fun render(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 9) % 997
        }
        return count
    }
}

fun main() {
    println(HybridMonitor().render(9))
}
