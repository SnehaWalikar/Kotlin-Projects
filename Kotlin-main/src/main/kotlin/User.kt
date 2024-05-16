class User(private val username: String, private val password: String) {
    private var loggedIn = false

    fun login(inputUsername: String, inputPassword: String) {
        if (inputUsername == username && inputPassword == password) {
            loggedIn = true
            println("Login successful!")
        } else {
            println("Invalid username or password.")
        }
    }

    fun displayExpenseSummary() {
        if (loggedIn) {
            // Code to display expense summary
            println("Displaying expense summary...")
        } else {
            println("Please log in first.")
        }
    }
}
