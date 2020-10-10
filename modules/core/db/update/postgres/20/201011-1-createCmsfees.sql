create table CMSFEES (
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
    TRNSCHL varchar(4),
    EXTTRNCD varchar(9),
    CHRGSCD varchar(10),
    CURR varchar(3),
    AUTHNM varchar(4),
    CATLST varchar(500),
    CHRGCDLST varchar(100),
    PRIORITY varchar(3),
    NETFEE integer,
    TERMFEE integer,
    ISSFEE integer,
    BNBFEE integer,
    TTLCHG integer,
    --
    primary key (ID)
);