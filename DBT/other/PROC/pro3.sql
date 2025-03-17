DROP PROCEDURE IF EXISTS getQualification;

delimiter $

CREATE PROCEDURE getQualification(in sid int)

BEGIN
    
	DECLARE v1 BOOLEAN DEFAULT FALSE;
	
	SELECT TRUE INTO v1 FROM student WHERE id=sid;
	
	if v1=1 THEN
	
	SELECT * from student_qualifications WHERE studentid=sid;
	
	ELSE
	
	SELECT 'Student Not Found' messageBox;
	
	end if;

end $

delimiter ;