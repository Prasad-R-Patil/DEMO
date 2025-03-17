DROP PROCEDURE IF EXISTS checkUser;

delimiter $

CREATE PROCEDURE checkUser(in mail VARCHAR(50))

BEGIN
      
	  DECLARE v1 BOOLEAN DEFAULT FALSE;
	  
	  SELECT TRUE INTO v1 FROM login WHERE email=mail;
	  
		IF v1=1 THEN
		
		SELECT username,password from login;
		
		ELSE
		
		INSERT INTO log (curr_date,curr_time,message)VALUES (CURRENT_DATE(),CURRENT_TIME(),'Email-ID Not Available' );
		
		select *from log;
		
		end if;
		
end $

delimiter ;