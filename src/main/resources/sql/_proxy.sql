use test;
DROP TABLE IF EXISTS _proxy;
create TABLE _proxy(
id int PRIMARY KEY auto_increment,
user_id int(50), /*游戏id*/
proxy_level int(1) not null,/*代理级别 1、2、3、...*/
phone VARCHAR (11) not NULL,
proxy_game int(1)NOT NULL /*代理游戏1、2、3....*/
)ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8;

INSERT INTO _proxy(user_id, proxy_level, phone, proxy_game) VALUES (47,1,15888888888,1);
INSERT INTO _proxy(user_id, proxy_level, phone, proxy_game) VALUES (46,1,12345678901,0);
INSERT INTO _proxy(user_id, proxy_level, phone, proxy_game) VALUES (48,1,98765432101,2);
