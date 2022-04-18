GRANT ALL ON TABLE addedService TO woqngctqysfais;
GRANT ALL ON TABLE service TO woqngctqysfais;
GRANT ALL ON TABLE reservation TO woqngctqysfais;

INSERT INTO reservation(id, name,surname,phoneNumber,registration,startDate,endDate) values ('39a849f8-6a2d-42fa-be31-04d011ebfdcd','Daniel','Modry','678976786','ELW ND67','2022-01-02','2022-02-10');
INSERT INTO service(id,name,price,maxAmount) values ('00000000-0000-0000-0000-000000000000','osoba dorosla',15,1);
INSERT INTO addedservice(id,reservation_id,service_id,amount,forMany,startDate,endDate) values ('c671b159-aaa0-4bb1-86de-3777a10a5a82','39a849f8-6a2d-42fa-be31-04d011ebfdcd','00000000-0000-0000-0000-000000000000',1,4,'2022-01-02','2022-02-10');