package quick_sort

fun main() {
    val num = 20
    var array = Array(num) { it }
        .toList()
        .shuffled()
        .toTypedArray()

    println("Initial array: ${array.toList()}")

    array = quickSort(array)

    println("Sorted array: ${array.toList()}")
}

fun quickSort(array: Array<Int>): Array<Int> {
    if (array.size < 2) {
        return array
    }

    val pivot = array[array.size / 2]

    val less = array.filter { it < pivot }.toTypedArray()
    val greater = array.filter { it > pivot }.toTypedArray()

    return quickSort(less) + pivot + quickSort(greater)
}