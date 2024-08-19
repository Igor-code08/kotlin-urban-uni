//Дан массив размерностью size. Вывести в том же
// порядке все четные числа из данного набора
// и количество K таких чисел.

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var even = 0
    val evenNumbers = mutableListOf<Int>()
    for (number in numbers) {
        if (number % 2 == 0) {
            evenNumbers.add(number)
            even++
        }
    }
    println("Четные числа: $evenNumbers")
    println("Количество четных чисел: $even")
}