-- update CMSCRDPROFILE set BIN = <default_value> where BIN is null ;
alter table CMSCRDPROFILE alter column BIN set not null ;
