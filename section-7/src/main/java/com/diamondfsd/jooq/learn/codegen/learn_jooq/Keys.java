/*
 * This file is generated by jOOQ.
 */
package com.diamondfsd.jooq.learn.codegen.learn_jooq;


import com.diamondfsd.jooq.learn.codegen.learn_jooq.tables.TS1User;
import com.diamondfsd.jooq.learn.codegen.learn_jooq.tables.TS2UserMessage;
import com.diamondfsd.jooq.learn.codegen.learn_jooq.tables.TS4ColumenGt22;
import com.diamondfsd.jooq.learn.codegen.learn_jooq.tables.TS4UnionKey;
import com.diamondfsd.jooq.learn.codegen.learn_jooq.tables.records.S1UserRecord;
import com.diamondfsd.jooq.learn.codegen.learn_jooq.tables.records.S2UserMessageRecord;
import com.diamondfsd.jooq.learn.codegen.learn_jooq.tables.records.S4ColumenGt22Record;
import com.diamondfsd.jooq.learn.codegen.learn_jooq.tables.records.S4UnionKeyRecord;

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
    public static final Identity<S2UserMessageRecord, Integer> IDENTITY_S2_USER_MESSAGE = Identities0.IDENTITY_S2_USER_MESSAGE;
    public static final Identity<S4ColumenGt22Record, Integer> IDENTITY_S4_COLUMEN_GT22 = Identities0.IDENTITY_S4_COLUMEN_GT22;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<S1UserRecord> KEY_S1_USER_PRIMARY = UniqueKeys0.KEY_S1_USER_PRIMARY;
    public static final UniqueKey<S2UserMessageRecord> KEY_S2_USER_MESSAGE_PRIMARY = UniqueKeys0.KEY_S2_USER_MESSAGE_PRIMARY;
    public static final UniqueKey<S4ColumenGt22Record> KEY_S4_COLUMEN_GT22_PRIMARY = UniqueKeys0.KEY_S4_COLUMEN_GT22_PRIMARY;
    public static final UniqueKey<S4UnionKeyRecord> KEY_S4_UNION_KEY_PRIMARY = UniqueKeys0.KEY_S4_UNION_KEY_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<S1UserRecord, Integer> IDENTITY_S1_USER = Internal.createIdentity(TS1User.S1_USER, TS1User.S1_USER.ID);
        public static Identity<S2UserMessageRecord, Integer> IDENTITY_S2_USER_MESSAGE = Internal.createIdentity(TS2UserMessage.S2_USER_MESSAGE, TS2UserMessage.S2_USER_MESSAGE.ID);
        public static Identity<S4ColumenGt22Record, Integer> IDENTITY_S4_COLUMEN_GT22 = Internal.createIdentity(TS4ColumenGt22.S4_COLUMEN_GT22, TS4ColumenGt22.S4_COLUMEN_GT22.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<S1UserRecord> KEY_S1_USER_PRIMARY = Internal.createUniqueKey(TS1User.S1_USER, "KEY_s1_user_PRIMARY", TS1User.S1_USER.ID);
        public static final UniqueKey<S2UserMessageRecord> KEY_S2_USER_MESSAGE_PRIMARY = Internal.createUniqueKey(TS2UserMessage.S2_USER_MESSAGE, "KEY_s2_user_message_PRIMARY", TS2UserMessage.S2_USER_MESSAGE.ID);
        public static final UniqueKey<S4ColumenGt22Record> KEY_S4_COLUMEN_GT22_PRIMARY = Internal.createUniqueKey(TS4ColumenGt22.S4_COLUMEN_GT22, "KEY_s4_columen_gt22_PRIMARY", TS4ColumenGt22.S4_COLUMEN_GT22.ID);
        public static final UniqueKey<S4UnionKeyRecord> KEY_S4_UNION_KEY_PRIMARY = Internal.createUniqueKey(TS4UnionKey.S4_UNION_KEY, "KEY_s4_union_key_PRIMARY", TS4UnionKey.S4_UNION_KEY.UK_1, TS4UnionKey.S4_UNION_KEY.UK_2);
    }
}
