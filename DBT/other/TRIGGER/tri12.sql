DROP TRIGGER IF EXISTS tri12;

delimiter $

CREATE TRIGGER tri12
BEFORE INSERT ON amazon_prime
FOR EACH ROW

BEGIN 
	
	IF new.membership_duration <3 then
		
		signal sqlstate '45000'
		set MESSAGE_TEXT = 'PLZ Select More Then 3 Month....';
		
	end if;
	



end $
delimiter ;