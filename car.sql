CREATE DATABASE coches;

USE coches;

CREATE TABLE car(
	codigo INTEGER,
	marca VARCHAR(20),
	modelo VARCHAR(20),
	anyo INTEGER,
	CONSTRAINT car_mod_pk PRIMARY KEY (codigo)
	);

CREATE TABLE usuario(
	nick VARCHAR(15),
	pass VARCHAR(15),
	CONSTRAINT usr_nic_pk PRIMARY KEY (nick)
	);

INSERT INTO car VALUES
('1000', 'AUDI', 'R8', '2018'),
('0002', 'BMW','X3', '2015'),
('0001', 'TOYOTA','YARIS', '2019'),
('0003', 'MERCEDES-BENZ','CLASE A', '2019'),
('0004', 'NISSAN','QASHQAI', '2018'),
('0005', 'PORSCHE','MACAN', '2018'),
('0006', 'OPEL','CORSA', '2002'),
('0007', 'SEAT','CORDOBA', '2000');
