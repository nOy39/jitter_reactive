create sequence hibernate_sequence start 1 increment 1;

create table user_role (
  user_id int8 not null,
  roles varchar(255)
);

create table usr (
  id int8 not null,
  active boolean not null,
  email varchar(255),
  password varchar(255),
  uniqid varchar(255),
  username varchar(255),
  primary key (id)
);
