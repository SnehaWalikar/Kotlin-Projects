fun main() {
    println("Enter the name of the event:")
    val name = readLine() ?: ""

    println("Enter the date of the event:")
    val date = readLine() ?: ""

    println("Enter the number of attendees:")
    val attendeeCount = readLine()?.toIntOrNull() ?: 0

    val event = Event(name, date, attendeeCount)

    println("Event created:")
    println("Name: ${event.name}")
    println("Date: ${event.date}")
    println("Attendee Count: ${event.attendeeCount}")
}
