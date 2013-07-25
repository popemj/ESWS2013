create table Greetings (
    id identity,
    message varchar not null
);

insert into Greetings (message) values ('Hello world');