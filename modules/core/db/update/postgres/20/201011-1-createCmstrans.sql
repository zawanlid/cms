create table CMSTRANS (
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
    PRI_TRANCD varchar(4),
    SEC_TRANCD varchar(4),
    TRANCD_DESCR varchar(100),
    PERMITTED varchar(1),
    --
    primary key (ID)
);