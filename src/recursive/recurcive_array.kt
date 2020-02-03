package recursive

fun main() {
    val array = Array(100_000) { it }
    var duration = 0L
    val count = 100

    repeat(count) {
        val startTime = System.currentTimeMillis()

        val shuffledArray = array.toList().shuffled().toTypedArray()
        quickSort(shuffledArray)

        val endTime = System.currentTimeMillis()

        duration += endTime - startTime
    }

    println("The quick sorting. Average Duration: ${(duration.toFloat() / count).toLong()}")
}

fun sum(array: Array<Int>): Int {
    if (array.isEmpty()) {
        return 0
    }

    return array.first() + sum(array.sliceArray(1 until array.size))
}

fun sizeOf(array: Array<Int>): Int {
    if (array.isEmpty()) {
        return 0
    }

    return 1 + sizeOf(array.sliceArray(1 until array.size))
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