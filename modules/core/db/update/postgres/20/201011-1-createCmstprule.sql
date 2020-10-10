create table CMSTPRULE (
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
    PRI_TRANCD varchar(50),
    SEC_TRANCD varchar(100),
    RNAME varchar(50),
    INDX integer,
    STEP integer,
    --
    primary key (ID)
);