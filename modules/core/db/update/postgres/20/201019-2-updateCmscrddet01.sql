alter table CMSCRDDET add constraint FK_CMSCRDDET_ON_CARD_MAST foreign key (CARD_MAST_ID) references CMSCRDMAST(ID);
create index IDX_CMSCRDDET_ON_CARD_MAST on CMSCRDDET (CARD_MAST_ID);
