/*
 * This file is generated by jOOQ.
 */
package com.diamondfsd.jooq.learn.s1.codegen.tables;


import com.diamondfsd.jooq.learn.s1.codegen.Indexes;
import com.diamondfsd.jooq.learn.s1.codegen.Keys;
import com.diamondfsd.jooq.learn.s1.codegen.LearnJooq;
import com.diamondfsd.jooq.learn.s1.codegen.tables.records.S1UserRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * USER TABLE
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class S1User extends TableImpl<S1UserRecord> {

    private static final long serialVersionUID = 1673188221;

    /**
     * The reference instance of <code>learn-jooq.s1_user</code>
     */
    public static final S1User S1_USER = new S1User();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<S1UserRecord> getRecordType() {
        return S1UserRecord.class;
    }

    /**
     * The column <code>learn-jooq.s1_user.id</code>. ID
     */
    public final TableField<S1UserRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "ID");

    /**
     * The column <code>learn-jooq.s1_user.username</code>.
     */
    public final TableField<S1UserRecord, String> USERNAME = createField(DSL.name("username"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>learn-jooq.s1_user.email</code>.
     */
    public final TableField<S1UserRecord, String> EMAIL = createField(DSL.name("email"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>learn-jooq.s1_user.address</code>.
     */
    public final TableField<S1UserRecord, String> ADDRESS = createField(DSL.name("address"), org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>learn-jooq.s1_user.create_time</code>.
     */
    public final TableField<S1UserRecord, Timestamp> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>learn-jooq.s1_user.update_time</code>.
     */
    public final TableField<S1UserRecord, Timestamp> UPDATE_TIME = createField(DSL.name("update_time"), org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>learn-jooq.s1_user</code> table reference
     */
    public S1User() {
        this(DSL.name("s1_user"), null);
    }

    /**
     * Create an aliased <code>learn-jooq.s1_user</code> table reference
     */
    public S1User(String alias) {
        this(DSL.name(alias), S1_USER);
    }

    /**
     * Create an aliased <code>learn-jooq.s1_user</code> table reference
     */
    public S1User(Name alias) {
        this(alias, S1_USER);
    }

    private S1User(Name alias, Table<S1UserRecord> aliased) {
        this(alias, aliased, null);
    }

    private S1User(Name alias, Table<S1UserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("USER TABLE"));
    }

    public <O extends Record> S1User(Table<O> child, ForeignKey<O, S1UserRecord> key) {
        super(child, key, S1_USER);
    }

    @Override
    public Schema getSchema() {
        return LearnJooq.LEARN_JOOQ;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.S1_USER_PRIMARY);
    }

    @Override
    public Identity<S1UserRecord, Integer> getIdentity() {
        return Keys.IDENTITY_S1_USER;
    }

    @Override
    public UniqueKey<S1UserRecord> getPrimaryKey() {
        return Keys.KEY_S1_USER_PRIMARY;
    }

    @Override
    public List<UniqueKey<S1UserRecord>> getKeys() {
        return Arrays.<UniqueKey<S1UserRecord>>asList(Keys.KEY_S1_USER_PRIMARY);
    }

    @Override
    public S1User as(String alias) {
        return new S1User(DSL.name(alias), this);
    }

    @Override
    public S1User as(Name alias) {
        return new S1User(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public S1User rename(String name) {
        return new S1User(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public S1User rename(Name name) {
        return new S1User(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
