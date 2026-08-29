class FastBuilder(private val state: Int = 24) {
    fun parse(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 24) % 997
        }
        return count
    }
}

fun main() {
    println(FastBuilder().parse(24))
}
