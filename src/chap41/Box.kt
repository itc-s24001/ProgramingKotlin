package chap41

class Box<T> {
    var label: String = ""
    var content: T? = null

    fun setValues(label: String, content: T) {
        this.label = label
        this.content = content
    }

    fun printValues() {
        println("$label : $content")
    }
}