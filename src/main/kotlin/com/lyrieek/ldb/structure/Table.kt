package com.lyrieek.ldb.structure

/**
 * 数据表
 */
class Table(override var name: String) : Entity {
    val column: List<String> = ArrayList()
}
