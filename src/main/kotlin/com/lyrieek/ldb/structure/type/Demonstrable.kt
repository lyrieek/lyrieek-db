package com.lyrieek.ldb.structure.type

import com.lyrieek.ldb.structure.Entity

/**
 * 可展示目标
 */
abstract class Demonstrable {

    /**
     * 展示物必须是实体,例如查询了多个表
     */
    val viewEntity: ArrayList<Entity> = ArrayList()

    /**
     * 展示所需的参数,例如WHERE条件,或是查存储过程所需的参数
     */
    val params: HashMap<String, String> = HashMap()

}