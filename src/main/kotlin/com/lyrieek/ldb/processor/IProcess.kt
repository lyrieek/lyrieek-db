package com.lyrieek.ldb.processor

abstract class IProcess {

    abstract val findKeywords: String

    var backSql: String = ""

    /**
     * 检查是否符合执行条件
     */
    fun check(sql: String): Boolean {
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

    /**
     * 提交处理
     */
    abstract fun submit(): ProcessResult

}