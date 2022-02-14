set role webbi_tech_user;
set search_path to webbi_sch;

insert into webbi_sch.user values (nextval('seq_user_id'), 'Albert', 'Akrachkov', null, now(), now(), true);
insert into webbi_sch.user values (nextval('seq_user_id'), 'Kristinochka');
insert into webbi_sch.user values (nextval('seq_user_id'), 'Egor', 'Letov', null, now(), now(), false);