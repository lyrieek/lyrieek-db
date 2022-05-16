package com.lyrieek.ldb

import com.lyrieek.ldb.dialect.PostgreParse

fun main() {
    val sqlStream: SQLStream = ParseFactory.getEngine(PostgreParse())
    sqlStream.devour(" SELECT * FROM USER --test")
    for (process in sqlStream) {
        sqlStream.propel(process.submit())
    }
    sqlStream.infer()
}
