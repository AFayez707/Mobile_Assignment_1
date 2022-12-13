class Ebook(title: String, author: String, price: Double, var fileType: String) : Book(title,author,price) {

    override fun read() {
        println("Read from Electronic Device")
    }
    override fun toString(): String {
        return "Ebook(title='$title', author='$author', price=$price, fileType=$fileType)"
    }
}