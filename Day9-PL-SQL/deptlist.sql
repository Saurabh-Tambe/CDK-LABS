DECLARE
 CURSOR c_dept IS  select deptno, dname, loc from Dept;
 v_deptno dept.deptno%TYPE ;
 v_dname dept.dname%TYPE  ;
 v_loc dept.loc%TYPE ;
begin
    dbms_output.put_line('in begin of deptlist'); 
	OPEN c_dept; 
	
	LOOP 
		FETCH c_dept INTO v_deptno, v_dname,v_loc;
		EXIT WHEN c_dept%notfound; 
		dbms_output.put_line('Data = '  || v_deptno || ', ' ||v_dname || ', ' || v_loc); 
	END LOOP; 
END;
/