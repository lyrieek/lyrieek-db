package com.lyrieek.ldb

object ParseFactory {

    fun getEngine(pe: ParseEngine): SQLStream {
        return SQLStream(pe)
    }
}