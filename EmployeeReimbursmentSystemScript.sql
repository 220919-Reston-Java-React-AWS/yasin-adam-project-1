--Users
create table users (
id serial primary key,
first_name VARCHAR(100),
last_name VARCHAR(100),
username VARCHAR(100),
password VARCHAR (100),
roles_id INTEGER,
constraint fk_roles_id foreign key(roles_id) references roles(id)
);

-- Roles
create table roles (
id serial primary key,
access_ VARCHAR(50)
);
insert into roles (access_) values 
('Manager'),
('Employee');



-- Ticket Info
create table tickets (
id serial primary key,
category VARCHAR(50),
amount numeric,
description VARCHAR (500),
users_id INTEGER,
status_id INTEGER,
constraint fk_status_id foreign key(status_id) references status(id),
constraint fk_users_id foreign key (users_id) references users(id)
);

-- Ticket Status
create table status  (
id serial primary key,
ticket_status VARCHAR (50)
);

----------------Functions and Procedures--------------------

