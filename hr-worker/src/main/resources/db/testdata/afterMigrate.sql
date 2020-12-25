set foreign_key_checks = 0;

delete from tb_worker;

set foreign_key_checks = 1;

alter table tb_worker auto_increment = 1;

INSERT INTO tb_worker (name, daily_Income) VALUES ('Bob', 200.0);
INSERT INTO tb_worker (name, daily_Income) VALUES ('Maria', 300.0);
INSERT INTO tb_worker (name, daily_Income) VALUES ('Alex', 250.0);