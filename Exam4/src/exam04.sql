
/*==============================================================*/
/* 1 - ������                                                   */
/*==============================================================*/

create table route(
	id 						integer				primary key,
	route_number			varchar(10)			unique not null,							--����� ��������
	starting_point			varchar(100)		not null,									--��������� �����
	end_point				varchar(100)		not null,									--�������� �����
	route_distance			integer				not null,									--����� �������� � ��
	time_interval			integer				not null									--�������� ������� � �������
);

insert into route(id, route_number, starting_point, end_point, route_distance, time_interval)
values	(1, '100-A', 	'mkr-12', 		'dordoi', 		22, 5),
		(2, '100-Z', 	'dordoi', 		'mkr-12', 		22, 5),
		(3, '100', 		'Archa-Beshik', 'Archa-Beshik', 19, 3);

create table driver(
	id						integer				primary key,
	full_name				varchar(50)			not null,									--��� ��������
	start_time				timestamp			not null,									--����� ������ ��������
	finish_time				timestamp			not null,									--����� �������� ��������
	work_experience			integer				not null,									--���� ��������
	route_number			integer				not null		references route(id)		--�������
);

insert into driver(id, full_name, start_time, finish_time, work_experience, route_number)
values 	(1, 'Marat uulu Altynbek',	'2021-02-05 08:00:00', '2021-02-05 09:35:00', 8, 1),
		(2, 'Cupibekov Kairat',		'2021-02-05 08:05:00', '2021-02-05 09:40:00', 13, 1),
		(3, 'Taalai sakbolov',		'2021-02-05 08:00:00', '2021-02-05 09:56:00', 5, 2),
		(4, 'Meder Atabekov',		'2021-02-05 08:05:00', '2021-02-05 10:06:00', 2, 2),
		(5, 'Sultan Muratov',		'2021-02-05 08:00:00', '2021-02-05 08:00:00', 3, 3);

create table bus(
	id						integer				primary key,
	driver					integer					 			references driver(id),		--�������� ��������
	bus_number				varchar(15)			unique not null,							--����� ��������
	landing_chair			integer				not null,									--���������� ���������� ����
	route_number			integer				not null 		references route(id)		--������� ��������
);


insert into bus(id, driver, bus_number, landing_chair, route_number)
values 	(1, 1, '011BA', 30, 1),
		(2, 2, '012BA', 40, 2),
		(3, 3, '013BA', 45, 3),
		(4, 4, '014BA', 30, 1),
		(5, 4, '015BA', 35, 3);


create table register_book(
	id						integer				primary key,
	turn_drivers			integer				unique not null,							--������� ���������
	bus_start_time			integer				not null 		references driver(id),		--����� ������ ��������
	bus_finish_time			integer				not null		references driver(id),		--����� ������ ��������
	driver					integer				not null		references driver(id),		--���������� � ���������
	bus						integer				not null		references bus(id),			--���������� � ���������
	route_number			integer				not null		references route(id)		--���������� � ���������		
);

insert into register_book(id, turn_drivers, bus_start_time, bus_finish_time, driver, bus, route_number)
values	(1, 1, 1, 1, 1, 1, 1),
		(2, 2, 2, 2, 2, 2, 1),
		(3, 3, 3, 3, 3, 3, 2),
		(4, 4, 4, 4, 4, 4, 2),
		(5, 5, 5, 5, 5, 5, 3);
	
	






/*==============================================================*/
/* 2 - ������                                                   */
/*==============================================================*/

create table news(
	id						integer				primary key,
	news_headline			varchar(100)		not null,
	news_text				varchar(1000)		unique not null,
	news_writer				varchar(30)			not null,
	publication_time		timestamp			not null,
);













