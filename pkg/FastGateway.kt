class RemoteWorker(private val state: Int = 44) {
    fun load(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 44) % 997
        }
        return acc
    }
}

fun main() {
    println(RemoteWorker().load(44))
}
