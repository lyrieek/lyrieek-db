package com.lyrieek.ldb.processor.base

import com.lyrieek.ldb.processor.IProcess
import com.lyrieek.ldb.processor.ProcessResult

/**
 * 注释处理
 */
class CommentProcess(override val findKeywords: String = "--") : IProcess() {

    override fun submit(): ProcessResult {
        val lineEnd = backSql.indexOf("\n")
        if (lineEnd == -1) {
            return ProcessResult(backSql.length)
        }
        return ProcessResult(lineEnd)
    }
}