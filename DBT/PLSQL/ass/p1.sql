DROP PROCEDURE p1;
delimiter $
CREATE PROCEDURE p1(in _username varchar(20), in _password varchar(20), in _email varchar(50))
BEGIN 
    insert into login VALUES (_username,_password,_email);
	end $
delimiter ;