DROP FUNCTION IF EXISTS AcceptEmailid;
delimiter $

CREATE FUNCTION AcceptEmailid(mail VARCHAR(50)) RETURNS VARCHAR(500)
DETERMINISTIC

BEGIN
	
	DECLARE x VARCHAR(100);
	DECLARE y VARCHAR(100);
	DECLARE Result VARCHAR(500);
	
	IF EXISTS (SELECT 1 from login WHERE email=mail)THEN
	
	SELECT username,password into x,y from login WHERE email=mail;
	
	set Result = CONCAT(x,' ','|',' ',y);
	
	RETURN Result;
	
	ELSE
	
	RETURN 'Employee Not EXISTS...';
	
	end if;


end $

delimiter ;