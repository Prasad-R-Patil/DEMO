DROP TRIGGER IF EXISTS tri11;

delimiter $

CREATE TRIGGER tri11
BEFORE INSERT ON amazon_prime
FOR EACH ROW

BEGIN 

   set new.membership_duration = ifnull(new.membership_duration,3);

end $

delimiter ;
