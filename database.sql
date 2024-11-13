create database Estramipymes;
use Estramipymes;
create table Company (
                         id_company varchar(15) not null primary key,
                         name_company varchar(100) not null,
                         email_company varchar(99) not null,
                         password_company varchar(20) not null,
                         user_type_company varchar(1) not null,
                         company_size varchar(1) not null,
                         company_field varchar(1) not null,
                         register_date_company date not null,
                         download_book_company boolean not null
);
create table Test (
                      id_test int not null primary key auto_increment,
                      id_company varchar(15) not null,
                      question_1 varchar(500) not null,
                      question_2 varchar(500) not null,
                      question_3 varchar(500) not null,
                      question_4 varchar(500) not null,
                      question_5 varchar(500) not null,
                      question_6 varchar(500) not null,
                      question_7 varchar(500) not null,
                      question_8 varchar(500) not null,
                      question_9 varchar(500) not null,
                      FOREIGN KEY  (id_company) REFERENCES Company(id_company)
);
create table Administrator (
                               id_administrator varchar(15) not null primary key,
                               email_administrator varchar(99) not null,
                               password_administrator varchar(20) not null
);
create table Teacher (
                         id_teacher varchar(15) not null primary key,
                         email_teacher varchar(99) not null,
                         password_teacher varchar(20) not null
);
create table Project (
                         id_project int not null primary key auto_increment,
                         name_project varchar(100) not null,
                         id_teacher varchar(15) not null,
                         id_company varchar(15) not null,
                         FOREIGN KEY (id_teacher) REFERENCES Teacher (id_teacher),
                         FOREIGN KEY (id_company) REFERENCES Company (id_company)
);
create table Student (
                         id_student int not null primary key,
                         id_project int,
                         id_teacher varchar(15) not null,
                         FOREIGN KEY (id_teacher) REFERENCES Teacher (id_teacher),
                         FOREIGN KEY (id_project) REFERENCES Project (id_project)
);