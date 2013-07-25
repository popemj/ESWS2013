create table Greeting (
  id identity,
  message varchar not null
);

create table AppUser (
    id identity,
    username varchar not null,
    password varchar not null
);

insert into Greeting (message) values ('Hello world');
