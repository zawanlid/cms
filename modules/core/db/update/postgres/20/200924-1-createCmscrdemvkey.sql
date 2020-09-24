create table CMSCRDEMVKEY (
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
    BIN_APPID varchar(12),
    BIN_KEYNM varchar(30),
    BIN_KEYVAL varchar(49),
    BIN_KCV varchar(8),
    BIN_KEYSCH varchar(1),
    BIN_SAVEDT date,
    --
    primary key (ID)
);