class Test {
    fun test() {
        val book = Book("The Alchemist", "Paulo Coelho", 12.99)
        val ebook = Ebook("The Alchemist", "Paulo Coelho", 12.99, "PDF")
        book.read()
        ebook.read()
        println(book.title)
        println(ebook.title)
        println(book.author)
        println(ebook.author)
        println(book.price)
        println(ebook.price)
        println(ebook.fileType)
    }

}

fun main(){
    val test = Test()
    test.test()
}