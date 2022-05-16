package com.lyrieek.ldb.processor

enum class ProcessAction {
    ROOT_OBJ,//操作类型,例如SELECT,DROP
    APPEND_OBJ,//追加子对象,例如FROM Table,SubQuery
    SET_ATTR,//设置属性,例如COLUMN,WHERE
    NONE,//无处理
}