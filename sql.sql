create  table users(
	id serial primary key,
	first_name varchar(30),
	last_name varchar(30),
	code varchar(10) unique 
);


create table author(
	id serial primary key,
	first_name varchar(30),
	last_name varchar(30),
	birth_day int
);

create  table admins(
	id serial primary key,
	first_name varchar(30),
	last_name varchar(30),
	username varchar(30),
	pass varchar(30)
);

create table book(
	id serial primary key,
	title varchar(20),
	author_id int references author(id)
	 
);

create table user_book(
	id serial primary key,
	book_id int references book(id),
	user_id int references users(id),
	admin_id int references admins(id),
	get_date int 
);



insert into author values(Default,?,?,?);


select id from author where first_name = 'omid' and last_name  =  'heidary';







