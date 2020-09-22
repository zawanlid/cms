create table CMSCRDPROFILE (
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
    BIN_DESCR varchar(45),
    BIN varchar(10),
    BINLEN integer,
    CRDLEN integer,
    PANLEN integer,
    --
    primary key (ID)
);