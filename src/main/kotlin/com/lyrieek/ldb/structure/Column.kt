package com.lyrieek.ldb.structure

class Column(val name: String) {
    var require: Boolean = false
    var condition: String = ""
    var alias: String = ""
        get() = field.ifEmpty { return name }
}