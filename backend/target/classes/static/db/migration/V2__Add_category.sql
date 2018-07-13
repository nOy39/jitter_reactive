create table category (
  id int8 not null,
  category_name varchar(255),
primary key (id)
);

create table task_category (
task_id int8 not null,
category_id int8 not null
);

alter table if
  exists task_category
  add constraint task_category_category_id
  foreign key (category_id)
  references category;

alter table if exists
  task_category
  add constraint task_category_task_id
  foreign key (task_id)
  references task;
