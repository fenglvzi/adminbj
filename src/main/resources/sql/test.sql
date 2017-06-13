
use test;
drop TABLE IF EXISTS book;
DROP TABLE IF EXISTS appointment;
  CREATE TABLE book(
  book_id INT (20) PRIMARY KEY auto_increment,
  name VARCHAR (100) not NULL ,
  number INT (11)NOT NULL
  );
INSERT into book(book_id,name,number)
VALUES
(1001,'java','12');
INSERT into book(book_id,name,number)
VALUES
  (1002,'C#','12');
  INSERT into book(book_id,name,number)
VALUES
  (1003,'C++','12');

 create table appointment (
  book_id int(20) not NULL ,
  student_id int(20) not NULL ,
  appoint_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP on UPDATE CURRENT_TIMESTAMP ,
  PRIMARY KEY (book_id,student_id),
  index index_appoint_time (appoint_time)
  )ENGINE = innoDB DEFAULT Charset=utf8

UPDATE user
SET diamond=diamond+#{diamond}
WHERE user_id=#{userId}