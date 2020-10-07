create table CMSCRDLNKFMT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FMTID varchar(10),
    FIELD varchar(20),
    DESCR varchar(50),
    POS integer,
    LENGTH integer,
    --
    primary key (ID)
);