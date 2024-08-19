//Дано целое число N(>0). Сформировать и вывести целочисленный массив размера N,
// содержащий степени двойки от первой до N-й: 2,4,8,16,….

fun main() {
    println("Введите целое число N (> 0):")
    val n = readLine()?.toIntOrNull()

    if (n != null && n > 0) {
        val powersOfTwo = IntArray(n)
        for (i in 0 until n) {
            powersOfTwo[i] = 2.pow(i + 1)
        }
        println("Степени двойки от 1 до $n: ${powersOfTwo.joinToString(", ")}")
    } else {
        println("Ошибка: введите число больше 0.")
    }
}
fun Int.pow(exponent: Int): Int {
    return Math.pow(this.toDouble(), exponent.toDouble()).toInt()
}