alter table CMSCRDACCT add constraint FK_CMSCRDACCT_ON_CARD_DET foreign key (CARD_DET_ID) references CMSCRDDET(ID);
create index IDX_CMSCRDACCT_ON_CARD_DET on CMSCRDACCT (CARD_DET_ID);
