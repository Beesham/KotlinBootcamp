/**
 * Takes a cmd line arg and makes a decision base on the value
 */
fun main(args: Array<String>) {
    print("${ if (args[0].toInt() < 12) ("Good morning Kotlin") else "Good Night, Kotlin "}")
}