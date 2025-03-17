DROP PROCEDURE IF EXISTS addStudent;

DELIMITER $

CREATE PROCEDURE addStudent(
    IN sid INT,
    IN fname VARCHAR(45),
    IN lname VARCHAR(45),
    IN dob DATE,
    IN mail VARCHAR(128),
    IN pid INT,
    IN pnumber VARCHAR(45),
    IN pactive BOOLEAN,
    IN aid INT,
    IN address VARCHAR(128)
)
BEGIN
--Prasad-R-Patil
   
    IF EXISTS (
        SELECT 1 
        FROM student s 
        JOIN student_phone sp ON s.id = sp.studentid 
        JOIN student_address sa ON s.id = sa.studentid 
        WHERE s.id = sid
    ) THEN
        SELECT 'Student Already EXISTS....' AS MessageBox;
    ELSE
        
        INSERT INTO student (id, namefirst, namelast, dob, emailid) 
        VALUES (sid, fname, lname, dob, mail);
        
       
        INSERT INTO student_phone (id, studentid, number, isActive) 
        VALUES (pid, sid, pnumber, pactive);
        
        
        INSERT INTO student_address (id, studentid, address) 
        VALUES (aid, sid, address);
        
        SELECT 'Student Added Successfully' AS MessageBox;
    END IF;
END $

DELIMITER ;
