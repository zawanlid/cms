create table CMSBRNMAINT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    INSTNO integer not null,
    BRNCD varchar(10) not null,
    BRN_NM integer,
    ADDR1 varchar(30),
    ADDR2 varchar(30),
    ADDR3 varchar(30),
    CITY varchar(30),
    STATE varchar(30),
    CNTRYCD varchar(2),
    MAINT_TYPE varchar(1),
    THRESHOLD integer,
    TOTAL_CRD integer,
    ISSUED_CRD integer,
    CURR_CRD_LVL integer,
    TOTAL_BATCHNUM integer,
    LAST_BATCHDT date,
    --
    primary key (ID)
);