create table CMS_CARD_GEN_REQ_DET (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    BRNCD varchar(10) not null,
    BATCHNUM integer not null,
    BIN varchar(10) not null,
    BTHREQ_DT date,
    CARDNUM varchar(16),
    EMBOSSNM varchar(30),
    LONGNM varchar(100),
    LANG varchar(1),
    STATE varchar(40),
    COUNTRY varchar(40),
    EXPDT date,
    --
    primary key (ID)
);