DROP PROCEDURE IF EXISTS addStudent;
DELIMITER $

CREATE PROCEDURE addStudent(IN id1 int ,in namefirst varchar(20),in namelast varchar(20), in id2 int, in number varchar(20), in id3 int, in address varchar(50))
BEGIN
	DECLARE EXIT HANDLER FOR 1364
    BEGIN
        SELECT 'Error: Student with this ID already exists' AS error_message;
    END;

     if(SELECT TRUE from student WHERE id=id1) THEN
	 
	 insert into student (id,namefirst,namelast) VALUES (id1,namefirst,namelast);
	 
	 insert into student_phone (id,number) VALUES (id2,number);
	 
	 insert into student_address (id,address) VALUES (id3,address);
	 
	 ELSE
	 SELECT 'student not found' warnning;
	 
	 end if;
	 
	SELECT * FROM student ;
    SELECT * FROM student_phone;
    SELECT * FROM student_address ;
    
END $



DELIMITER ;
