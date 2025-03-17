DROP PROCEDURE IF EXISTS addQualification;

delimiter $

CREATE PROCEDURE addQualification(
    IN qid INT,
    IN sid INT,
	in qname VARCHAR(128),
	in qcollege VARCHAR(128),
	in quniversity VARCHAR(128),
	in qmarks VARCHAR(45),
	in qyear int   
)
BEGIN

   
    IF EXISTS ( SELECT 1 FROM student WHERE id=sid)THEN
		
		INSERT INTO student_qualifications (id,studentid,name,college,university,marks,year) VALUES(qid,sid,qname,qcollege,quniversity,qmarks,qyear);
         
        SELECT 'RECORD INSERTED Successfully' AS MessageBox;
		
    ELSE
        
         SELECT 'Student Not Found....' AS MessageBox;
        
       
    END IF;
END $

delimiter ;
