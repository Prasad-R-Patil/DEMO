DROP TRIGGER IF EXISTS tri5;

delimiter $

CREATE TRIGGER tri5
BEFORE INSERT on login
FOR EACH ROW

BEGIN
		
		set  new.email = LOWER(new.email);
	


end $
delimiter ;