DROP TRIGGER IF EXISTS tri7;

delimiter $

CREATE TRIGGER tri7
BEFORE UPDATE ON login
FOR EACH ROW

BEGIN

     if old.email != new.email THEN
	 
	 signal sqlstate '45000'
	 set MESSAGE_TEXT = 'YOU CAN NOT CHANGE Email-ID...';
	 
	 end if;


end $
delimiter ;