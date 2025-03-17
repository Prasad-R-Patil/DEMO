DROP TRIGGER IF EXISTS tri8;
delimiter $

CREATE TRIGGER tri8
AFTER UPDATE ON login
FOR EACH ROW

BEGIN

	INSERT INTO logs VALUES(old.username,new.username);


end $
delimiter ;