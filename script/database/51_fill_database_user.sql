set role webbi_tech_user;
set search_path to webbi_sch;

insert into webbi_sch.database_user values (nextval('hibernate_sequence'), 'Albert');
insert into webbi_sch.database_user values (nextval('hibernate_sequence'), 'Kristinochka');
insert into webbi_sch.database_user values (nextval('hibernate_sequence'), 'Semen');