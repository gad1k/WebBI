set role webbi_tech_user;

create table webbi_sch.user (
    id int8 not null,
    first_name varchar(100) not null,
    last_name varchar(200),
    dt_birth_day timestamp,
    dt_create timestamp,
    dt_update timestamp,
    is_active boolean default false,
    primary key (id)
);