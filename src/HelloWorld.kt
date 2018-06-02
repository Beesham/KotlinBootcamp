import java.util.*

fun main(args: Array<String>) {
    dayOfWeek()
    helloWorld()
}

fun helloWorld() {
    println("Hello World")
}

fun dayOfWeek() {
    println("What day of the week is it?")
    val dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    when (dayOfWeek) {      //OR print( when(dayOfWeek) {....
        1 -> print("Sunday")
        2 -> print("Monday")
        3 -> print("Tueday")
        4 -> print("Wednesday")
        5 -> print("THursday")
        6 -> print("Friday")
        7 -> print("Satday")
    }
}