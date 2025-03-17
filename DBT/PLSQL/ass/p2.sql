DROP PROCEDURE IF EXISTS checkUser;
DELIMITER $

CREATE PROCEDURE checkUser(IN emailID VARCHAR(50))
BEGIN
    IF EXISTS (SELECT TRUE FROM login WHERE email = emailID) THEN
        SELECT username, password FROM login WHERE email = emailID;
    ELSE
        INSERT INTO log (curr_date,curr_time,message) VALUES (curdate(),now(),'User not found');
    END IF;
	
	
	SELECT *from log;
END $



DELIMITER ;
