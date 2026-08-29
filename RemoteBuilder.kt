class BatchBuffer(private val state: Int = 87) {
    fun render(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 87) % 997
        }
        return acc
    }
}

fun main() {
    println(BatchBuffer().render(87))
}
