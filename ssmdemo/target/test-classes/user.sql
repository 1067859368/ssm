create t_user;

use t_user;
create table t_user(
	user_id int(11) NOT NULL AUTO_INCREMENT COMMENT '�û�id'',
	user_name varchar(20) NOT NULL COMMENT '����',
	user_age varchar(20) NOT NULL COMMENT '����',
	PRIMARY KEY(user_id)	
)ENGINE=INNODB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

INSERT INTO t_user.t_user
	(user_name,user_age)
VALUES('����','18');


