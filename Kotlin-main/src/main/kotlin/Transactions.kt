// Base class Transaction
open class Transactions(val date: String, val amount: Double)

// Derived class Income inheriting from Transaction
class Income(date: String, amount: Double, val source: String) : Transactions(date, amount)

// Derived class Expense inheriting from Transaction
class Expense(date: String, amount: Double, val category: String) : Transactions(date, amount)
