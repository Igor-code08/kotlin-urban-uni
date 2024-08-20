//Создать массив из 10 чисел с плавающей точкой.
// Найти произведение его элементов.

fun main() {
    val numbers = doubleArrayOf(1.5, 2.0, 3.5, 4.0, 5.5, 6.0, 7.1, 8.2, 9.3, 10.4)
    var result = 1.0
    for (number in numbers) {
        result *= number
    }
    println("Произведение элементов массива: $result")
}