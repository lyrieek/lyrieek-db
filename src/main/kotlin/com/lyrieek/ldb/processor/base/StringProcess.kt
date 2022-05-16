package com.lyrieek.ldb.processor.base

import com.lyrieek.ldb.processor.IProcess
import com.lyrieek.ldb.processor.ProcessResult

/**
 * 字符串处理
 */
class StringProcess(override val findKeywords: String = "'") : IProcess() {

    override fun submit(): ProcessResult {
        val charPoint = backSql.substring(1).indexOf(findKeywords)
        if (charPoint == -1) {
            throw RuntimeException("loss '")
        }
        return ProcessResult(charPoint + 1)
    }

}
