import java.nio.file.Files
import java.nio.file.Paths

abstract class MyAbstract {
    abstract fun doSomething()
}

class MyConcrete : MyAbstract() {
    override fun doSomething() {
        println("Hola!")
    }
}

fun main(args: Array<String>) {
    // unit (no result func.)
    fun saySomething() {
        println("Hello")
    }
    saySomething()

    // function
    fun sum(a: Int, b: Int): Int =  a + b

    // string interpolation
    println("The result is ${sum(1,2)}.")

    // iterating list
    val list = listOf("a", "b", "c")
    for (item in list) {
        println(item)
    }

    // range
    for (i in 1..5) {
        println(i)
    }

    // streams, lambdas
    val fruits = listOf("banana", "avocado", "apple", "lemon")
    fruits.filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }

    val mymap = mapOf(1 to "a", 2 to "b")
    if (2 in mymap) {
        println(mymap[2])
    }

    // data class, equals operator (==)
    data class Person(val name: String, var age: Int)
    val p = Person("Joe", 22)
    val q = Person("Joe", 22)
    println(p == q)
    p.age += 1
    println(p)

    // nullable dereference, default
    fun printName(p : Person?) : Unit = println( p?.name ?: "Anonymous")

    printName(p)
    printName(null)

    // if as expression
    val j = 3
    val k = if (j > 2) "Foo" else "Boo"
    println(k)

    // try-with resource
    val file = Paths.get("C:\\temp\\test.txt")
    val content = Files.newInputStream(file).bufferedReader().use { it.readText() }
    println(content)

}