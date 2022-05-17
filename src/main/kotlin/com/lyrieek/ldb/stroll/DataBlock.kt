package com.lyrieek.ldb.stroll

class DataBlock(private val text: String) {

    var child: List<DataBlock> = emptyList()

    override fun toString(): String {
        var append = ""
        if (child.isEmpty()) {
            append += child.toString()
        }
        return text + append
    }

}
