package com.lyrieek.ldb.processor.base

import com.lyrieek.ldb.processor.IProcess
import com.lyrieek.ldb.processor.ProcessResult

class SymbolProcess(override val findKeywords: String = "") : IProcess() {

    override fun submit(): ProcessResult {
        val find = Regex("[ \n\t\r]+").find(backSql) ?: return ProcessResult(backSql.length)
        System.err.println("未知符号:" + backSql.substring(0, find.range.first))
        return ProcessResult(find.range.first)
    }

}