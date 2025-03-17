DROP FUNCTION IF EXISTS SumMarks;

delimiter $

CREATE FUNCTION SumMarks(id int) RETURNS int
DETERMINISTIC

BEGIN

	DECLARE x int DEFAULT 0;
	
	SELECT sum(marks) into x from student_qualifications WHERE name in ('10','12','be') and studentid=id;
	
	RETURN COALESCE(x,0);

end $

delimiter ;