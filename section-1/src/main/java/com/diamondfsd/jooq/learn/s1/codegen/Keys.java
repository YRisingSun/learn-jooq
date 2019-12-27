/*
 * This file is generated by jOOQ.
 */
package com.diamondfsd.jooq.learn.s1.codegen;


import com.diamondfsd.jooq.learn.s1.codegen.tables.S1User;
import com.diamondfsd.jooq.learn.s1.codegen.tables.records.S1UserRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>learn-jooq</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<S1UserRecord, Integer> IDENTITY_S1_USER = Identities0.IDENTITY_S1_USER;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<S1UserRecord> KEY_S1_USER_PRIMARY = UniqueKeys0.KEY_S1_USER_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<S1UserRecord, Integer> IDENTITY_S1_USER = Internal.createIdentity(S1User.S1_USER, S1User.S1_USER.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<S1UserRecord> KEY_S1_USER_PRIMARY = Internal.createUniqueKey(S1User.S1_USER, "KEY_s1_user_PRIMARY", S1User.S1_USER.ID);
    }
}
