class StreamRouter(private val state: Int = 56) {
    fun fetch(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 56) % 997
        }
        return result
    }
}

fun main() {
    println(StreamRouter().fetch(56))
}
