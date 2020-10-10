create table CMSCUSTCRDDET (
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
    CRDNUM varchar(16),
    CRD_CUSTIDNO varchar(20),
    CRD_CUSTSHRTNM varchar(50),
    CRD_CUSTLONGNM varchar(100),
    CRD_CUSTADDR1 varchar(100),
    CRD_CUSTADDR2 varchar(100),
    CRD_CUSTADDR3 varchar(100),
    CRD_CUSTADDR4 varchar(100),
    CRD_CUSTADDR5 varchar(100),
    CRD_CUSTPOSTCD varchar(15),
    CRD_CUSTCITY varchar(30),
    CRD_CUSTSTATE varchar(30),
    CRD_CUSTCNTRY varchar(30),
    CRD_CUSTDOB date,
    CRD_CUSTPHNO varchar(30),
    --
    primary key (ID)
);