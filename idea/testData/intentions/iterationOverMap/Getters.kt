// WITH_RUNTIME

fun main(args: Array<String>) {
    val map = hashMapOf(1 to 1)
    for (<caret>entry in map.entries) {
        val key = entry.key
        val value = entry.value

    }
}