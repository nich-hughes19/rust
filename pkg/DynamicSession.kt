class SharedRouter(private val state: Int = 29) {
    fun load(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 29) % 997
        }
        return count
    }
}

fun main() {
    println(SharedRouter().load(29))
}
