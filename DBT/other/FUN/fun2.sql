DROP FUNCTION IF EXISTS autoNumber;

delimiter $

CREATE FUNCTION autoNumber() RETURNS int
DETERMINISTIC

BEGIN
	
	set @x=0;
	
	SELECT ifnull(max(studentid),0)+1 into @x from student_new;
	
	RETURN @x;

end $

delimiter ;