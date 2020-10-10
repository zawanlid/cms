create table CMSCRDCHRGS (
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
    CHRGS_TYPE varchar(4),
    CHRGS_DESCR varchar(50),
    OPT_1TM varchar(1),
    OPT_STAFF_WAIVE varchar(1),
    OPT_CHRG_FREQ varchar(1),
    OPT_CHRG_BY varchar(1),
    CHRG_AMT integer,
    --
    primary key (ID)
);