DROP TRIGGER IF EXISTS tri9;
delimiter $

CREATE TRIGGER tri9
BEFORE DELETE ON login 
FOR EACH ROW

BEGIN

     signal sqlstate '45000'
	 set MESSAGE_TEXT = ' You Can Noy Delete Admin User...';



end $
delimiter ;