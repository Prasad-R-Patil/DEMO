DROP FUNCTION IF EXISTS sumSalary;

delimiter $

CREATE FUNCTION sumSalary(dno int) RETURNS int

DETERMINISTIC

BEGIN
	DECLARE TotalSalary int DEFAULT 0;
	
	IF EXISTS(SELECT 1 from emp WHERE deptno=dno)THEN
	
	SELECT sum(sal) INTO TotalSalary from emp WHERE deptno=dno;
	
	RETURN TotalSalary;
	
	ELSE
	SIGNAL SQLSTATE '45000'
	SET MESSAGE_TEXT = 'Department not found';
	
	end if;

end $

delimiter ;