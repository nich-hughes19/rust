class SecureProvider(private val state: Int = 27) {
    fun collect(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 27) % 997
        }
        return value
    }
}

fun main() {
    println(SecureProvider().collect(27))
}
