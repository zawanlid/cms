create table CMSFILEFMT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    INST_NO integer not null,
    FMT_TYPE varchar(10) not null,
    FMT_ID varchar(10) not null,
    FIELD varchar(30) not null,
    DESCR varchar(50),
    POS integer,
    LENGTH integer,
    LASTUPDATED date,
    LASTUPDATED_BY varchar(10),
    --
    primary key (ID)
);