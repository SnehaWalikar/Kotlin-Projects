// Sample Transaction class
data class Task7Day2(val date: String, val amount: Double)

fun main() {
    // Sample list of transactions
    val transactions = listOf(
        Task7Day2("2024-05-15", 100.0),
        Task7Day2("2024-05-16", 150.0),
        Task7Day2("2024-05-14", 75.0)
    )

    // Filter transactions by date
    val desiredDate = "2024-05-15"
    val filteredTransactions = transactions.filter { it.date == desiredDate }
    println("Transactions on $desiredDate:")
    filteredTransactions.forEach { println("${it.date} - ${it.amount}") }

    // Sort transactions by amount
    val sortedTransactions = transactions.sortedBy { it.amount }
    println("\nTransactions sorted by amount:")
    sortedTransactions.forEach { println("${it.date} - ${it.amount}") }
}
