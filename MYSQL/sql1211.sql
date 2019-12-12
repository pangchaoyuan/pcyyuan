CREATE DATABASE SQL1211;
USE SQL1211;
CREATE TABLE STUDENT (
    NAME VARCHAR(20),
	AGE INT,
	GENDER VARCHAR(3),
	HEIGHT DOUBLE,
	WEIGHT DOUBLE
);


INSERT INTO STUDENT(NAME,AGE,GENDER,HEIGHT,WEIGHT)VALUES
("孙悟空",18,'男',160,30),
("唐三藏",6,'保密',70,60),
("猪八戒",34,'女',185,200),
("观世音菩萨",500,'保密',170,50),
("沙悟净",50,'男',180,70);

CREATE TABLE STUDENTS (
    NAME VARCHAR(20) UNIQUE,
	AGE INT  DEFAULT 90000,
	GENDER VARCHAR(3) DEFAULT '人妖',
	HEIGHT DOUBLE  NOT NULL,
	WEIGHT DOUBLE  UNIQUE NOT NULL
);

INSERT INTO STUDENTS(NAME,GENDER,HEIGHT,WEIGHT)VALUES
("观世音菩萨",'保密',170,50),
("沙悟净",504,'男',180,70);


CREATE TABLE STUDENTS1 (
      id   int(11) PRIMARY AUTO_INCREAMENT,          //主键不可重复不能为NULL, 自动....的意思是自动生成默认得唯一数值,不用手动输入
    NAME VARCHAR(20) UNIQUE,
	AGE INT  DEFAULT 90000,
	GENDER VARCHAR(3) DEFAULT '人妖',
	HEIGHT DOUBLE  NOT NULL,
	WEIGHT DOUBLE  UNIQUE NOT NULL
);





/*建表的三大范式

1.字段不可再分；
2.字段和完整主键有关系
3.字段和主键是直接关系
*/

CREATE TABLE  PEOPLE(
 NAME VARCHAR(20) UNIQUE,
 PEOPLE_ID  INT PRIMARY AUTO_INCREAMENT
 
)

CREATE TABLE LECTURE(
 LECTURE_ID INT PRIMARY AUTO_INCREAMENT,
 TITLE VARCHAR(100),
 CONTENT  TEXT,
 PEOPLE_ID INT ,
 PUBLISH1 DATETIME
 
)


CREATE TABLE IDEA(
  IDEA_ID INT AUTO_INCREAMENT,
  PEOPLE_ID INT ,
  LECTURE_ID INT ,
  CONTENT  TEXT,
  PUBLISH1 DATETIME,
  PRIMARY KEY(PEOPLE_ID,LECTURE_ID)  
)

CREATE TABLE ZAN(
PEOPLE_ID INT ,
LECTURE_ID INT,
PRIMARY KEY(PEOPLE_ID,LECTURE_ID)

)





