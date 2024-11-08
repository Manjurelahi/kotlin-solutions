fun Any?.toString(): String {
    if (this == null) return "NULL variable"
    return toString()
}

class ExtensionClass {
    companion object {}
}

fun ExtensionClass.Companion.print() {
    println("Print Method called from ExtensionClass Companion")
}

fun main() {
    var a:Any? = null
    println(a.toString())
    ExtensionClass.print()
}

/*
Output:
NULL variable
Print Method called from ExtensionClass Companion
 */