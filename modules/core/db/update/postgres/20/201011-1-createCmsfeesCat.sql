create table CMSFEES_CAT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CATTYPE varchar(4),
    CATVAL varchar(4),
    CATDESCR varchar(100),
    --
    primary key (ID)
);