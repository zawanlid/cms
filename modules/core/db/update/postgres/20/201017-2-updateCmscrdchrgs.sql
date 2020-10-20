-- alter table CMSCRDCHRGS add column CARD_PROFILE_ID uuid ^
-- update CMSCRDCHRGS set CARD_PROFILE_ID = <default_value> ;
-- alter table CMSCRDCHRGS alter column CARD_PROFILE_ID set not null ;
alter table CMSCRDCHRGS add column CARD_PROFILE_ID uuid not null ;
