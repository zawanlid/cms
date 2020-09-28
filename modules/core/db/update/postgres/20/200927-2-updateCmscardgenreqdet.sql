alter table CMSCARDGENREQDET rename column batchnum to batchnum__u73265 ;
alter table CMSCARDGENREQDET alter column batchnum__u73265 drop not null ;
alter table CMSCARDGENREQDET drop constraint FK_CMSCARDGENREQDET_ON_BATCHNUM ;
drop index IDX_CMSCARDGENREQDET_ON_BATCHNUM ;
-- alter table CMSCARDGENREQDET add column CARD_GEN_ID uuid ^
-- update CMSCARDGENREQDET set CARD_GEN_ID = <default_value> ;
-- alter table CMSCARDGENREQDET alter column CARD_GEN_ID set not null ;
alter table CMSCARDGENREQDET add column CARD_GEN_ID uuid not null ;
alter table CMSCARDGENREQDET add column BATCHNUM varchar(4) ^
update CMSCARDGENREQDET set BATCHNUM = '' where BATCHNUM is null ;
alter table CMSCARDGENREQDET alter column BATCHNUM set not null ;
