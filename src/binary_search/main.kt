package binary_search

val source = arrayListOf<Int>().apply {
    addAll(1..100_000_000)
}

fun main() {
    val max = source.max()!!

    val binaryStart = System.currentTimeMillis()
    val maxIndex = source.binarySearch(max)
    val binaryEnd = System.currentTimeMillis()

    println("Binary search: $maxIndex. Duration: ${binaryEnd - binaryStart}")
}