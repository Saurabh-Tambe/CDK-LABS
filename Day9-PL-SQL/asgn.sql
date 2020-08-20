DECLARE
 CURSOR c_dept IS  select deptno, dname, loc from Dept;
 v_deptno dept.deptno%TYPE ;
 v_dname dept.dname%TYPE  ;
 v_loc dept.loc%TYPE ;
 e_name emp.ename%TYPE;
 a number;
 
 CURSOR c_emp IS  select ename from emp where deptno=a;
begin
	if c_dept%ISOPEN then
    close c_dept;
  end if;
  if c_emp%ISOPEN then
    close c_emp;
  end if;

    dbms_output.put_line('DeptNO      DeptName      deptLoc      ' ); 
	OPEN c_dept; 
	LOOP 
		FETCH c_dept INTO v_deptno, v_dname,v_loc;
		EXIT WHEN c_dept%notfound; 
		
		a:=v_deptno;
		OPEN c_emp;
		dbms_output.put_line( v_deptno || '      ' ||v_dname || '       ' || v_loc); 
		a:=1;
			LOOP 
				FETCH c_emp INTO e_name;
				--EXIT WHEN ;
				IF c_emp%notfound THEN
					IF a = 1 THEN
						dbms_output.put_line('_         No Employee Records        ');
					END IF;
					EXIT ;
				END IF;
				dbms_output.put_line('_        '|| e_name);
				a:=0;
			END LOOP;
		CLOSE c_emp;
	END LOOP; 
	CLOSE c_dept;
END;
/