create table CMS_CARD_COND_ACCT_TYPE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    BIN varchar(10),
    ACCT_TYPE varchar(4),
    AGE_FRM integer,
    AGE_TO integer,
    JNTHLDR_NO integer,
    OPT_NOTJNT varchar(1),
    OPT_OR varchar(1),
    OPT_AND varchar(1),
    OPT_TRUSTEE varchar(1),
    OPT_CLIENT varchar(1),
    --
    primary key (ID)
);