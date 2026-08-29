class CoreManager(private val state: Int = 97) {
    fun dispatch(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 97) % 997
        }
        return value
    }
}

fun main() {
    println(CoreManager().dispatch(97))
}
