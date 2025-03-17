DROP TRIGGER IF EXISTS tri10;

delimiter $

CREATE TRIGGER tri10
AFTER DELETE ON orders
FOR EACH ROW

BEGIN

	INSERT INTO archive VALUES (old.onum,old.amt,old.odate,old.cnum,old.snum,old.type,old.paymenttype,old.registered);


end $

delimiter ;

