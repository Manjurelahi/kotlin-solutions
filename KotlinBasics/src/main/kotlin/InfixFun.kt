class MathUtil {
    infix fun square(n: Int): Int { return n*n }
}
fun main() {
    val mu = MathUtil()
    print(mu square 5)
}
// Output: 25