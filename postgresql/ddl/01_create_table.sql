\c "webbi_db"
create schema webbi authorization "webbi_user";

create table webbi.database_user (
    id int8 not null,
    name varchar(255),
    primary key (id)
);

create sequence webbi.hibernate_sequence start 1 increment 1;

grant all on all tables in schema webbi to "webbi_user";
grant all on all sequences in schema webbi to "webbi_user";