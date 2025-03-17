DROP PROCEDURE IF EXISTS pro1;

delimiter $

CREATE PROCEDURE pro1(
	in name VARCHAR(20),
	in pass VARCHAR(20),
	in mail VARCHAR(50))

BEGIN
INSERT INTO login VALUES (name,pass,mail);

SELECT *FROM login;
end $
delimiter ;