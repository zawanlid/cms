create table CMSRULES (
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
    RNAME varchar(50),
    RDESCR varchar(100),
    STS varchar(1),
    --
    primary key (ID)
);