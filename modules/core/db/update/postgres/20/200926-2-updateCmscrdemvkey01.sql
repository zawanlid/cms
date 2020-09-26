-- update CMSCRDEMVKEY set BIN = <default_value> where BIN is null ;
alter table CMSCRDEMVKEY alter column BIN set not null ;
