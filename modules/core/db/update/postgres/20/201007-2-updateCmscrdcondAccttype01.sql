alter table CMSCRDCOND_ACCTTYPE add constraint FK_CMSCRDCOND_ACCTTYPE_ON_CARD_COND foreign key (CARD_COND_ID) references CMSCRDCOND(ID);
create index IDX_CMSCRDCOND_ACCTTYPE_ON_CARD_COND on CMSCRDCOND_ACCTTYPE (CARD_COND_ID);
