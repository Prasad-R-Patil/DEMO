DROP TRIGGER IF EXISTS tri6;

delimiter $

CREATE TRIGGER tri6
BEFORE INSERT ON login 
FOR EACH ROW

BEGIN

	set new.username = ifnull(new.username,'Admin');
	

end $
delimiter ;