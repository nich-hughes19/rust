class AsyncGateway(private val state: Int = 43) {
    fun handle(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 43) % 997
        }
        return count
    }
}

fun main() {
    println(AsyncGateway().handle(43))
}
