package com.lyrieek.ldb.language

import com.lyrieek.ldb.language.dql.Query

enum class SQLBaseType {
    DDL,//Data Definition Language,数据定义语言
    DQL,//Data Query Language,数据查询语言
    DML,//Data Manipulation Language,数据操纵语言
    DCL,//Data Control Language,数据控制语言
    TCL//Transaction Control Language,事务控制语言
}

enum class SQLType(val base: SQLBaseType, val operation: BaseOperations) {
    SELECT(SQLBaseType.DQL, Query()),

    INSERT(SQLBaseType.DML, NotImplOperation()),
    UPDATE(SQLBaseType.DML, NotImplOperation()),
    DELETE(SQLBaseType.DML, NotImplOperation()),
    LOCK(SQLBaseType.DML, NotImplOperation()),
    CALL(SQLBaseType.DML, NotImplOperation()),
    EXPLAIN(SQLBaseType.DML, NotImplOperation()),

    CREATE(SQLBaseType.DDL, NotImplOperation()),
    DROP(SQLBaseType.DDL, NotImplOperation()),
    ALTER(SQLBaseType.DDL, NotImplOperation()),
    TRUNCATE(SQLBaseType.DDL, NotImplOperation()),
    RENAME(SQLBaseType.DDL, NotImplOperation()),

    GRANT(SQLBaseType.DCL, NotImplOperation()),
    DENY(SQLBaseType.DCL, NotImplOperation()),

    SAVEPOINT(SQLBaseType.TCL, NotImplOperation()),
    ROLLBACK(SQLBaseType.TCL, NotImplOperation()),
    COMMIT(SQLBaseType.TCL, NotImplOperation());
}