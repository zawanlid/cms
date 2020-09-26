alter table CMSCRDPROFILE add constraint FK_CMSCRDPROFILE_ON_CRD_PRF_DET foreign key (CRD_PRF_DET_ID) references CMSCRDPROFILEDET(ID);
alter table CMSCRDPROFILE add constraint FK_CMSCRDPROFILE_ON_CRD_EMV_KEY foreign key (CRD_EMV_KEY_ID) references CMSCRDEMVKEY(ID);
create index IDX_CMSCRDPROFILE_ON_CRD_PRF_DET on CMSCRDPROFILE (CRD_PRF_DET_ID);
create index IDX_CMSCRDPROFILE_ON_CRD_EMV_KEY on CMSCRDPROFILE (CRD_EMV_KEY_ID);