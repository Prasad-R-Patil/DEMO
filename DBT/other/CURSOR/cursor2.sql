DROP PROCEDURE IF EXISTS GetAllData;

delimiter $

CREATE PROCEDURE GetAllData()

BEGIN
	DECLARE v_id int;
	DECLARE v_studentid int;
	DECLARE v_number VARCHAR(20);
	DECLARE v_isActive BOOLEAN;
	
	DECLARE Done INT DEFAULT 0;
	
	DECLARE c1 CURSOR FOR SELECT *FROM student_phone;
	
	DECLARE CONTINUE HANDLER FOR NOT FOUND SET Done=1;

	OPEN c1;
	
	lbl: LOOP
	 
	 FETCH c1 INTO v_id,v_studentid,v_number,v_isActive;
	 
	 IF Done THEN
	  leave lbl;
	  end IF;
	  
	  SELECT v_id,v_studentid,v_number,v_isActive;
	  
	  end LOOP;
	  
	  CLOSE c1;
	  
	  SELECT 'No More Data Found' AS MessageBox;


end $
delimiter ;