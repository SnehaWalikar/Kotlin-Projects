package assignment_2

class StringTemplate {
    var name: String = ""
    fun display(): String{
        return "Welcome $name, How is your journey in Learning Kotlin is going."
    }
}

fun main(){
    var res = StringTemplate()
    res.name = "Sneha"

    println(res.display())
}