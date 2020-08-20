DECLARE
 v_deptno dept.deptno%TYPE :=&deptno;
 v_dname dept.dname%TYPE  := 'AA';
 v_loc dept.loc%TYPE := 'Pnq';
BEGIN
  
  insert into dept values (v_deptno, v_dname,v_loc);
   IF sql%ROWCOUNT = 1 THEN 
      dbms_output.put_line('Not Found, inserted successfully '); 
   END IF;

EXCEPTION
	--dbms_output.put_line('exception  ...');
	WHEN others THEN 
      dbms_output.put_line('Problem inserting, Deptno exists'); 
END;
/