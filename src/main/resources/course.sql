# drop table if exists `t_user`;
create table `t_user`(
 `id` bigint(11) not null AUTO_INCREMENT,
 `username` varchar(50) default null,
 `password` varchar(50) default null,
 `datetime` datetime  default null,
 primary key (`id`)
)engine=InnoDB default charset=utf8;

create table `t_student`(
                      `sid` bigint(11) not null AUTO_INCREMENT,
                      `sname` varchar(50) default null,
                      `age` int(2) default null,
                      `gradeID` int(2)  default null,
                      primary key (`sid`)
)engine=InnoDB default charset=utf8;

create table `t_teacher`(
                         `tid` bigint(11) not null AUTO_INCREMENT,
                         `tname` varchar(50) default null,
                         `courseIDs` varchar(20) default null,
                         primary key (`tid`)
)engine=InnoDB default charset=utf8;

create table `t_course`(
                         `cid` bigint(11) not null AUTO_INCREMENT,
                         `courseName` varchar(50) default null,
                         `numOfWeek` int(2) default null,
                         `teacherid` bigint(11) default null,
                         primary key (`cid`)
)engine=InnoDB default charset=utf8;

create table `t_courseRange`(
                        `cid` bigint(11) not null AUTO_INCREMENT,
                        `term` int(2) default 0,
                        `week` int(2) default 0,
                        `day` int(2) default 0,
                        `lesson` int(2) default 0,
                        `teacherid` bigint(11) default null,
                        `courseID` bigint(11) default null,
                        primary key (`cid`)
)engine=InnoDB default charset=utf8;

create table `t_eachingClass`(
                             `tid` bigint(11) not null AUTO_INCREMENT,
                             `grade` int(2) default 0,
                             `classNum` int(2) default 0,
                             `teacherid` bigint(11) default null,
                             primary key (`tid`)
)engine=InnoDB default charset=utf8;

