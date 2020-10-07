create table CMSCRDCOND (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    INSTNO integer,
    BIN varchar(10),
    BIN_MAX_ACCTS varchar(4),
    --
    primary key (ID)
);