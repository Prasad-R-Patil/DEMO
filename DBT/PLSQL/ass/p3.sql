DROP PROCEDURE IF EXISTS getQualification;
DELIMITER $

CREATE PROCEDURE getQualification(IN id1 int)
BEGIN

     if(SELECT TRUE from student WHERE id=id1) THEN
	 
	 SELECT s.*,sq.* from student s join student_qualifications sq on s.id = sq.studentid WHERE s.id=id1;
	 
	 ELSE
	 SELECT 'student not found' warnning;
	 
	 end if;
    
END $



DELIMITER ;
