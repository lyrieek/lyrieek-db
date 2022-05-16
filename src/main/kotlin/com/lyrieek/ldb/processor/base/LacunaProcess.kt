package com.lyrieek.ldb.processor.base

import com.lyrieek.ldb.processor.IProcess
import com.lyrieek.ldb.processor.ProcessResult

/**
 * 空白内容
 */
class LacunaProcess : IProcess() {

    override val findKeywords = " |\n|\t|\r"

    override fun submit(): ProcessResult {
        return ProcessResult(backSql.length - backSql.trimStart().length)
    }
}