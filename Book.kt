open class Book() {
    var title: String = ""
    var author: String = ""
    var price: Double = 0.0

    constructor(title: String, author: String, price: Double) : this() {
        this.title = title
        this.author = author
        this.price = price
    }
    open fun read(){
        println("Reading Paper book")
        }

override fun toString(): String {
        return "Book(title='$title', author='$author', price=$price)"
    }
}