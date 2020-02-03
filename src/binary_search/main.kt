package binary_search

fun main() {
  val num = 20
  var array = Array(num) { it }
      .toList()
      .shuffled()
      .toTypedArray()

  array = quick_sort.quickSort(array)

  println("Initial array: ${array.toList()}")

  val index = binarySearch(array, 11)

  println("Index of zero = $index")
}

fun binarySearch(array: Array<Int>, number: Int): Int {
  var firstIndex = 0
  var lastIndex = array.size - 1

  while (firstIndex <= lastIndex) {
    val middleIndex = (firstIndex + lastIndex) / 2

    when {
      array[middleIndex] === number -> return middleIndex
      array[middleIndex] < number -> firstIndex = middleIndex + 1
      array[middleIndex] > number -> lastIndex = middleIndex - 1
    }
  }
  return -1
}