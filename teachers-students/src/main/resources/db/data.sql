DROP TABLE IF EXISTS accounts;

CREATE TABLE accounts (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  login VARCHAR(250) NOT NULL,
  password VARCHAR(250) NOT NULL,
  confirm_password VARCHAR (250) NOT NULL,
  clazz VARCHAR(250) NOT NULL,
  teacher BIT NOT NULL
);

 insert into accounts(login, password, confirm_password, clazz, teacher) values ('rodzic1@wp.pl', 'test123', 'test123', '1', false);
 insert into accounts(login, password, confirm_password, clazz, teacher) values ('rodzic2@wp.pl', 'wred123', 'wred123', '2', false);
 insert into accounts(login, password, confirm_password, clazz, teacher) values ('naucz1@wp.pl', 'naucz123', 'naucz123', '1', true);
 insert into accounts(login, password, confirm_password, clazz, teacher) values ('naucz2@wp.pl', 'naucz222', 'naucz222', '2', true);

DROP TABLE IF EXISTS students;

CREATE TABLE students(
    id      INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(250) NOT NULL,
    last_name VARCHAR(250) NOT NULL,
   clazz    VARCHAR(250) NOT NULL

);

-- -- insert into students(first_name, last_name, clazz) values ('Jan', 'Nowak', '1');
DROP TABLE IF EXISTS photos;
-- Alter table students add column photos_id int null;
--
CREATE TABLE PHOTOS(
    id      INT AUTO_INCREMENT PRIMARY KEY,
    id_student INT,
    photo VARCHAR
)

-- alter table students add foreign key (photos_id) references PHOTOS (id);