package selection_sort

fun main() {
    val num = 20
    val array = Array(num) { it }
        .toList()
        .shuffled()
        .toTypedArray()

    println("Initial array: ${array.toList()}")

    selectionSort(array)

    println("Sorted array: ${array.toList()}")
}

fun selectionSort(array: Array<Int>, start: Int = 0) {
    var minIndex = start
    var min = array[minIndex]

    for (i in start + 1 until array.size) {
        if (array[i] < min) {
            minIndex = i
            min = array[minIndex]
        }
    }

    val temp = array[start]

    array[start] = min
    array[minIndex] = temp

    if (start != array.lastIndex) {
        selectionSort(array, start + 1)
    }
}