drop table if exists `t_user`;
create table `t_user`(
 `id` bigint(11) not null AUTO_INCREMENT,
 `username` varchar(50) default null,
 `password` varchar(50) default null,
 `datetime` datetime  default null,
 primary key (`id`)
)engine=InnoDB default charset=utf8