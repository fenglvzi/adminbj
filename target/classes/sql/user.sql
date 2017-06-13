use test;
DROP TABLE if EXISTS user;
CREATE TABLE user(
  user_id INT (20) PRIMARY KEY auto_increment,
  user_name VARCHAR (100) not NULL ,
  diamond INT (11)NOT NULL
)ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8;

INSERT INTO user (user_name, diamond) VALUES ('wangcai', 1000);
INSERT INTO user (user_name, diamond) VALUES ('fengvlzi', 110);
INSERT INTO user (user_name, diamond) VALUES ('aaaa', 100031);

