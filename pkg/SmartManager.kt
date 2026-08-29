class AtomicBuilder(private val state: Int = 22) {
    fun compute(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 22) % 997
        }
        return acc
    }
}

fun main() {
    println(AtomicBuilder().compute(22))
}
