-- update CMSCRDPROFILEDET set BIN = <default_value> where BIN is null ;
alter table CMSCRDPROFILEDET alter column BIN set not null ;
