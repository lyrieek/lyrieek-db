package com.lyrieek.ldb.processor.base

import com.lyrieek.ldb.processor.IProcess
import com.lyrieek.ldb.processor.ProcessResult

class SymbolProcess(override val findKeywords: String = "") : IProcess() {

    override fun submit(): ProcessResult {
        val find = Regex("[ \n\t\r]+").find(backSql) ?: return ProcessResult(backSql.length)
        val symbol = backSql.substring(0, find.range.first);
        if (symbol == "*") {
            println("选取所有")
        } else {
            System.err.println("未知符号:$symbol")
        }
        return ProcessResult(find.range.first)
    }

}