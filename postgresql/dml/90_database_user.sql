\c "webbi_db"

set search_path to webbi;

insert into webbi.database_user values (nextval('hibernate_sequence'), 'Albert');
insert into webbi.database_user values (nextval('hibernate_sequence'), 'Kristinochka');
insert into webbi.database_user values (nextval('hibernate_sequence'), 'Semen');
