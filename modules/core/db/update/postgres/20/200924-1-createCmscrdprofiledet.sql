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
    PINTRIES_DEF_LMT integer,
    PINTRIES_MAX_LMT integer,
    FREETXN_DEF_LMT integer,
    FREETXN_MAX_LMT integer,
    DEP_DET_LMT integer,
    DEP_MAX_LMT integer,
    --
    primary key (ID)
);