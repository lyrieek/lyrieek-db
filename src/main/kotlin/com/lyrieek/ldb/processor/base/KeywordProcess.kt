package com.lyrieek.ldb.processor.base

import com.lyrieek.ldb.language.BaseOperations
import com.lyrieek.ldb.language.SQLType
import com.lyrieek.ldb.processor.IProcess
import com.lyrieek.ldb.processor.ProcessResult
import java.util.*

/**
 * 关键词处理器
 */
class KeywordProcess(override val findKeywords: String = "") : IProcess() {

    private lateinit var oper: BaseOperations
    private var step: Int = 0

    override fun innerCheck(): Boolean {
        val find = Regex("^[a-zA-Z_]+").find(backSql) ?: return false
        for (value in SQLType.values()) {
            if (value.name.uppercase() == find.value.uppercase()) {
                oper = value.oper
                step = find.range.last + 1
                return true
            }
        }
        return false
    }

    override fun submit(): ProcessResult {
        println("操作:\"${oper.javaClass}\"")
        return ProcessResult(step)
    }

}
