-- update CMSCRDEMVOLDKEY set BIN = <default_value> where BIN is null ;
alter table CMSCRDEMVOLDKEY alter column BIN set not null ;
