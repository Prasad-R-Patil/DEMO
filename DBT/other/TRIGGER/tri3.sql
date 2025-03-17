DROP TRIGGER IF EXISTS tri3;

delimiter $

CREATE TRIGGER tri3 
BEFORE DELETE on emp 
FOR EACH ROW

BEGIN
	signal sqlstate '45000'
	set MESSAGE_TEXT='You Can Not Delete Employee...';
    

end $

delimiter ;