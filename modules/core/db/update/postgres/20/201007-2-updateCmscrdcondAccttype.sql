-- alter table CMSCRDCOND_ACCTTYPE add column CARD_COND_ID uuid ^
-- update CMSCRDCOND_ACCTTYPE set CARD_COND_ID = <default_value> ;
-- alter table CMSCRDCOND_ACCTTYPE alter column CARD_COND_ID set not null ;
alter table CMSCRDCOND_ACCTTYPE add column CARD_COND_ID uuid not null ;
