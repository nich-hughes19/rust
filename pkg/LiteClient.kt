class StreamController(private val state: Int = 20) {
    fun encode(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 20) % 997
        }
        return value
    }
}

fun main() {
    println(StreamController().encode(20))
}
