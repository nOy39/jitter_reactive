create table task (
  id          int8    not null,
  created     timestamp,
  deadline    timestamp,
  description varchar(2048),
  done        boolean not null,
  name        varchar(255),
  task_id     int8,
  primary key (id)
);

create table user_role (
  user_id int8 not null,
  roles   varchar(255)
);

create table usr (
  id       int8    not null,
  active   boolean not null,
  email    varchar(255),
  password varchar(255),
  username varchar(255),
  primary key (id)
);

create sequence hibernate_sequence
  start 1
  increment 1;

alter table if exists task
  add constraint subtask_constr
  foreign key (task_id) references task;

alter table if exists user_role
  add constraint user_role_constr
  foreign key (user_id) references usr;
