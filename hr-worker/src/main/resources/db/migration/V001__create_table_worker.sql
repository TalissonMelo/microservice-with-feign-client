 create table tb_worker (
	id bigint not null auto_increment,
	name varchar(120) not null,
	daily_income decimal(10,2) not null,
		
	primary key (id)
)engine = InnoDB default charset=utf8;