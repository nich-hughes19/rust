class DynamicRouter(private val state: Int = 25) {
    fun collect(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 25) % 997
        }
        return count
    }
}

fun main() {
    println(DynamicRouter().collect(25))
}
