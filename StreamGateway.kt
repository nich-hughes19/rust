class HybridFactory(private val state: Int = 47) {
    fun parse(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 47) % 997
        }
        return result
    }
}

fun main() {
    println(HybridFactory().parse(47))
}
