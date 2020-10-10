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
    BIN varchar(10) not null,
    BIN_DESCR varchar(45),
    BINLEN integer,
    INSTNO integer,
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
    DEC_TBL varchar(16),
    MAILER_TYPE integer,
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
    CRD_PRF_DET_ID uuid not null,
    CRD_EMV_KEY_ID uuid not null,
    --
    primary key (ID)
)^
-- end CMSCRDPROFILE
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
    BIN varchar(10) not null,
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
    BIN varchar(10) not null,
    RENEW_PERIOD integer not null,
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
    TRFDR_DEF_LMT integer,
    TRFDR_MAX_LMT integer,
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
    DEP_DEF_LMT integer,
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
    BIN varchar(10) not null,
    BIN_APPID varchar(12) not null,
    BIN_KEYNM varchar(30),
    BIN_KEYVAL varchar(49),
    BIN_KCV varchar(8),
    BIN_KEYSCH varchar(1),
    BIN_SAVEDT date,
    --
    primary key (ID)
)^
-- end CMSCRDEMVKEY
-- begin CMSCARDGENREQ
create table CMSCARDGENREQ (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    BRN_CD varchar(10) not null,
    BATCHNUM varchar(4) not null,
    BATCHSTS varchar(5) not null,
    BIN varchar(10) not null,
    BTHREQ_DT date,
    CRDEMB_DT date,
    PINMLR_DT date,
    FILEUPL_DT date,
    REQ_USERID1 varchar(10),
    REQ_USERID2 varchar(10),
    EMB_USERID1 varchar(10),
    EMB_USERID2 varchar(10),
    MLR_USERID1 varchar(10),
    MLR_USERID2 varchar(10),
    FUL_USERID1 varchar(10),
    FUL_USERID2 varchar(10),
    BATCH_CNT integer,
    RENEW varchar(1),
    POSTGEN varchar(1),
    LAST_UPDATED date,
    STSUPD_USERID varchar(10),
    --
    primary key (ID)
)^
-- end CMSCARDGENREQ

-- begin CMSCARDGENREQDET
create table CMSCARDGENREQDET (
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
    BATCHNUM varchar(4) not null,
    CARD_GEN_ID uuid not null,
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
)^
-- end CMSCARDGENREQDET
-- begin CMSBRNMAINT
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
    INSTNO integer,
    BIN varchar(10),
    BRNCD varchar(10),
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
    BATCHSTS varchar(30),
    CURR_STATUS varchar(30),
    --
    primary key (ID)
)^
-- end CMSBRNMAINT
-- begin CMSFILEFMT
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
    INST_NO integer,
    FMT_TYPE varchar(10),
    FMT_ID varchar(10),
    FIELD varchar(30),
    DESCR varchar(50),
    POS integer,
    LENGTH integer,
    LASTUPDATED date,
    LASTUPDATED_BY varchar(10),
    --
    primary key (ID)
)^
-- end CMSFILEFMT
-- begin CMSCRDLNKFMT
create table CMSCRDLNKFMT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FMTID varchar(10),
    FIELD varchar(20),
    DESCR varchar(50),
    POS integer,
    LENGTH integer,
    --
    primary key (ID)
)^
-- end CMSCRDLNKFMT

-- begin CMSCRDCOND
create table CMSCRDCOND (
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
    BIN_MAX_ACCTS varchar(4),
    --
    primary key (ID)
)^
-- end CMSCRDCOND
-- begin CMSCRDCOND_ACCTTYPE
create table CMSCRDCOND_ACCTTYPE (
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
    ACCT_TYPE varchar(4),
    AGE_FRM integer,
    AGE_TO integer,
    JNTHLDR_NO integer,
    OPT_NOTJNT varchar(1),
    OPT_OR varchar(1),
    OPT_AND varchar(1),
    OPT_TRUSTEE varchar(1),
    OPT_CLIENT varchar(1),
    CARD_COND_ID uuid not null,
    --
    primary key (ID)
)^
-- end CMSCRDCOND_ACCTTYPE
-- begin CMSCRDACCT
create table CMSCRDACCT (
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
    CRD_ACCTNO varchar(18),
    CRD_ACCTTYPE varchar(2),
    CRD_ACCTCCY varchar(3),
    CRD_ACCTSTS varchar(1),
    CRD_OPT_PRIACCT varchar(1),
    CRD_OPT_FCSH varchar(1),
    CRD_OPT_CSH varchar(1),
    CRD_OPT_DEP varchar(1),
    CRD_OPT_INQ varchar(1),
    CRD_OPT_REQ varchar(1),
    CRD_OPT_TRF varchar(1),
    CRD_OPT_TRFDR varchar(1),
    CRD_OPT_TRFCR varchar(1),
    CRD_OPT_TRF3 varchar(1),
    CRD_OPT_IBFT varchar(1),
    CRD_OPT_IBFTDR varchar(1),
    CRD_OPT_IBFTCR varchar(1),
    --
    primary key (ID)
)^
-- end CMSCRDACCT
-- begin CMSCRDMAST
create table CMSCRDMAST (
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
    CRDNUM varchar(16),
    CRDSTS varchar(2),
    CRD_CLSTYPE varchar(5),
    CRD_ISSUEDT date,
    CRD_ISSUED integer,
    CRD_CYCPRD integer,
    CRD_EMBOSSNM varchar(28),
    CRD_PINRETRIES_CNT integer,
    CRD_PINOFFSET varchar(12),
    CRD_PINSERIALNO varchar(18),
    CRD_EXPMTH varchar(2),
    CRD_EXPYR varchar(4),
    CRD_COLLECT_TYPE varchar(2),
    CRD_FCSH_AVL integer,
    CRD_FCSH_LMT integer,
    CRD_CSH_AVL integer,
    CRD_CSH_LMT integer,
    CRD_TRN_AVL integer,
    CRD_TRN_LMT integer,
    CRD_TRNDR_AVL integer,
    CRD_TRNDR_LMT integer,
    CRD_TRNCR_AVL integer,
    CRD_TRNCR_LMT integer,
    CRD_IBFT_AVL integer,
    CRD_IBFT_LMT integer,
    CRD_IBFTDR_AVL integer,
    CRD_IBFTDR_LMT integer,
    CRD_IBFTCR_AVL integer,
    CRD_IBFTCR_LMT integer,
    CRD_BILL_AVL integer,
    CRD_BILL_LMT integer,
    CRD_FREETXN_AVL integer,
    CRD_FREETXN_LMT integer,
    CRD_PINRETRIES_LMT integer,
    CRD_USE_AVL integer,
    CRD_USE_LMT integer,
    CRD_CARDSEQ integer,
    CRD_ATC varchar(4),
    CRD_LANGCD varchar(1),
    CRD_CHRGS_WAIVED varchar(1),
    CRD_PINTAGGED_DT date,
    CRD_ACCTLINK_DT date,
    CRD_COLLECT_DT date,
    CRD_CLOSE_DT date,
    CRD_LASTACCCHG_DT date,
    CRD_LASTACT_DT date,
    CRD_LASTMAINT_DT date,
    CRD_LASTSTSCHG_DT date,
    CRD_LASTCYC_DT date,
    --
    primary key (ID)
)^
-- end CMSCRDMAST
-- begin CMSCRDDET
create table CMSCRDDET (
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
    CRD_CUSTPOSTCD varchar(15),
    CRD_CUSTCITY varchar(30),
    CRD_CUSTSTATE varchar(30),
    CRD_CUSTCNTRY varchar(30),
    CRD_CUSTDOB date,
    CRD_CUSTPHNO varchar(30),
    --
    primary key (ID)
)^
-- end CMSCRDDET
-- begin CMSCRDCHRGS
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
)^
-- end CMSCRDCHRGS

-- begin CMSTPRULE
create table CMSTPRULE (
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
    PRI_TRANCD varchar(50),
    SEC_TRANCD varchar(100),
    RNAME varchar(50),
    INDX integer,
    STEP integer,
    --
    primary key (ID)
)^
-- end CMSTPRULE
-- begin CMSFEES_CHRGCD
create table CMSFEES_CHRGCD (
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
    CHRGCD varchar(10),
    CHRGCD_DESCR varchar(100),
    CHRGCD_CURR varchar(3),
    CHRGCD_TENORBY varchar(1),
    RATE1 integer,
    RATE2 integer,
    RATE3 integer,
    RATE4 integer,
    RATE5 integer,
    RATE6 integer,
    MINAMT integer,
    MAXAMT integer,
    TAMT1 integer,
    TAMT2 integer,
    TAMT3 integer,
    TAMT4 integer,
    TAMT5 integer,
    TAMT6 integer,
    FAMT1 integer,
    FAMT2 integer,
    FAMT3 integer,
    FAMT4 integer,
    FAMT5 integer,
    FAMT6 integer,
    GLCD varchar(20),
    LSTUPD date,
    --
    primary key (ID)
)^
-- end CMSFEES_CHRGCD
-- begin CMSTRANS
create table CMSTRANS (
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
    PRI_TRANCD varchar(4),
    SEC_TRANCD varchar(4),
    TRANCD_DESCR varchar(100),
    PERMITTED varchar(1),
    --
    primary key (ID)
)^
-- end CMSTRANS
-- begin CMSCUSTCRDACCTDET
create table CMSCUSTCRDACCTDET (
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
    CRD_ACCTNO varchar(18),
    CRD_ACCTTYPE varchar(2),
    CRD_ACCTCCY varchar(3),
    CRD_ACCTSTS varchar(1),
    CRD_OPT_PRIACCT varchar(1),
    CRD_OPT_FCSH varchar(1),
    CRD_OPT_CSH varchar(1),
    CRD_OPT_DEP varchar(1),
    CRD_OPT_INQ varchar(1),
    CRD_OPT_REQ varchar(1),
    CRD_OPT_TRF varchar(1),
    CRD_OPT_TRFDR varchar(1),
    CRD_OPT_TRFCR varchar(1),
    CRD_OPT_TRF3 varchar(1),
    CRD_OPT_TRF3DR varchar(1),
    CRD_OPT_TRF3CR varchar(1),
    CRD_OPT_IBFT varchar(1),
    CRD_OPT_IBFTDR varchar(1),
    CRD_OPT_IBFTCR varchar(1),
    --
    primary key (ID)
)^
-- end CMSCUSTCRDACCTDET
-- begin CMSCUSTCRDMAST
create table CMSCUSTCRDMAST (
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
    CRDNUM varchar(16),
    CRDSTS varchar(2),
    CRD_CLSTYPE varchar(5),
    CRD_ISSUED integer,
    CRD_RETURN integer,
    CRD_CYCPRD integer,
    CRD_EMBOSSNM varchar(28),
    CRD_PINRETRIES_CNT integer,
    CRD_PINOFFSET varchar(12),
    CRD_PINSERIALNO varchar(18),
    CRD_EXPMTH varchar(2),
    CRD_EXPYR varchar(4),
    CRD_COLLECT_TYPE varchar(2),
    CRD_CSH_AVL integer,
    CRD_CSH_LMT integer,
    CRD_OFF_CSH_AVL integer,
    CRD_OFF_CSH_LMT integer,
    CRD_TRN_AVL integer,
    CRD_TRN_LMT integer,
    CRD_TRNDR_AVL integer,
    CRD_TRNDR_LMT integer,
    CRD_IBFT_AVL integer,
    CRD_IBFT_LMT integer,
    CRD_IBFTDR_AVL integer,
    CRD_IBFTDR_LMT integer,
    CRD_BILL_AVL integer,
    CRD_BILL_LMT integer,
    CRD_FREETXN_AVL integer,
    CRD_FREETXN_LMT integer,
    CRD_PINRETRIES_LMT integer,
    CRD_USE_AVL integer,
    CRD_USE_LMT integer,
    CRD_CARDSEQ integer,
    CRD_ATC varchar(4),
    CRD_LANGCD varchar(1),
    CRD_CHRGS_WAIVED varchar(1),
    CRD_PINISSUED_DT date,
    CRD_LINK_DT date,
    CRD_COLLECT_DT date,
    CRD_CLOSE_DT date,
    CRD_LASTACCCHG_DT date,
    CRD_LASTACT_DT date,
    CRD_LASTMAINT_DT date,
    CRD_LASTSTSCHG_DT date,
    CRD_LASTCYC_DT date,
    --
    primary key (ID)
)^
-- end CMSCUSTCRDMAST
-- begin CMSFEES_CAT
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
)^
-- end CMSFEES_CAT
-- begin CMSCUSTCRDDET
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
)^
-- end CMSCUSTCRDDET
-- begin CMSRULES
create table CMSRULES (
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
    RNAME varchar(50),
    RDESCR varchar(100),
    STS varchar(1),
    --
    primary key (ID)
)^
-- end CMSRULES
-- begin CMSFEES
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
)^
-- end CMSFEES
