package com.lyrieek.ldb.processor

abstract class IProcess {

    abstract val findKeywords: String

    var backSql: String = ""

    /**
     * 检查是否符合执行条件
     */
    fun check(sql: String): Boolean {
        if (findKeywords.isEmpty()) {
            backSql = sql
            return innerCheck()
        }
        if (findKeywords.contains("|")) {
            findKeywords.split("|").forEach {
                if (sql.startsWith(it)) {
                    backSql = sql
                    return true;
                }
            }
        } else if (sql.startsWith(findKeywords)) {
            backSql = sql
            return true
        }
        return false
    }

    open fun innerCheck(): Boolean {
        return true
    }

    /**
     * 提交处理
     */
    abstract fun submit(): ProcessResult

}