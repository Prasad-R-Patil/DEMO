DROP PROCEDURE IF EXISTS GetAllStudent;
DELIMITER $

CREATE PROCEDURE GetAllStudent()
BEGIN
    DECLARE v_id INT;
    DECLARE v_namefirst VARCHAR(20);
    DECLARE v_namelast VARCHAR(20);
    DECLARE v_dob DATE;
    DECLARE v_emailid VARCHAR(50);
    
	DECLARE done INT DEFAULT 0;
    
    DECLARE c1 CURSOR FOR SELECT *FROM student;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done=1;

    OPEN c1;

    lbl: LOOP
        FETCH c1 INTO v_id, v_namefirst, v_namelast, v_dob, v_emailid;
       
	    IF done THEN
            LEAVE lbl;  
        END IF;
		
        SELECT v_id, v_namefirst, v_namelast, v_dob, v_emailid;
    END LOOP;

    CLOSE c1;
	
	SELECT 'No More Data Available' AS MessageBox;
	
END $

DELIMITER ;
