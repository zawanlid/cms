-- begin CMSCRDPROFILE
create table CMSCRDPROFILE (
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
    BIN_DESCR varchar(45),
    BIN varchar(10),
    BINLEN integer,
    CRDLEN integer,
    PANLEN integer,
    CRD_FMT varchar(20),
    PVKI varchar(2),
    ENC_METHOD varchar(1),
    PIN_TYPE varchar(1),
    PIN_OFFSET integer,
    PAN_OFFSET integer,
    PIN_LEN integer,
    PIN_CHK_LEN integer,
    PAD_CHAR varchar(1),
    SER_VCD varchar(5),
    MAILER_TYPE varchar(6),
    DEC_TBL varchar(16),
    PVK1 varchar(49),
    PVK1_KCV varchar(8),
    PVK2 varchar(49),
    PVK2_KCV varchar(8),
    CVK1 varchar(49),
    CVK1_KCV varchar(8),
    CVK2 varchar(16),
    CVK2_KCV varchar(8),
    PIN_ALG integer,
    CRD_TYPE varchar(15),
    --
    primary key (ID)
)^
-- end CMSCRDPROFILE
-- begin CMSCRDPROFILEDET
create table CMSCRDPROFILEDET (
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
    RENEW_PERIOD integer,
    ENF_GLB_LMT varchar(1),
    CYC_PRD_DEF integer,
    CYC_PRD_MAX integer,
    WDL_DEF_LMT integer,
    WDL_MAX_LMT integer,
    FWDL_DEF_LMT integer,
    FWDL_MAX_LMT integer,
    NET_WDL_DEF_LMT integer,
    NET_WDL_MAX_LMT integer,
    MBL_TRF_LMT integer,
    MBL_TRF_MAX_LMT integer,
    TRF_DEF_LMT integer,
    TRF_MAX_LMT integer,
    TRFCR_DEF_LMT integer,
    TRFCR_MAX_LMT integer,
    THRDTRF_DEF_LMT integer,
    THRDTRF_MAX_LMT integer,
    IBFT_DEF_LMT integer,
    IBFT_MAX_LMT integer,
    IBFTDR_DEF_LMT integer,
    IBFTDR_MAX_LMT integer,
    IBFTCR_DEF_LMT integer,
    IBFTCR_MAX_LMT integer,
    PINTRIES_DEF_LMT integer,
    PINTRIES_MAX_LMT integer,
    FREETXN_DEF_LMT integer,
    FREETXN_MAX_LMT integer,
    DEP_DET_LMT integer,
    DEP_MAX_LMT integer,
    CRD_DEF_LMT integer,
    CRD_MAX_LMT integer,
    --
    primary key (ID)
)^
-- end CMSCRDPROFILEDET

-- begin CMSCRDEMVKEY
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
)^
-- end CMSCRDEMVKEY
-- begin CMSCRDEMVOLDKEY
create table CMSCRDEMVOLDKEY (
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
)^
-- end CMSCRDEMVOLDKEY
