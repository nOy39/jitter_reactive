insert into usr(id, username, password, active,uniqid,email)
    values (1,'admin','admin',true,'Ibah128<bn-1234567890','email@email.com');

    insert into usr(id, username, password, active,uniqid,email)
    values (2,'author','author',true,'userTest','email@email.com');

insert into user_role (user_id, roles)
values (1, 'USER'), (1, 'ADMIN');

insert into user_role (user_id, roles)
values (2, 'USER');