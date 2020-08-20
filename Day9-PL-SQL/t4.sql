DECLARE
v_mgr emp.mgr%TYPE :=&mgr;
mytotal number(2) ;
BEGIN
  mytotal := reporting_count(v_mgr);
  dbms_output.put_line('Number of people reporting to  manager ' ||v_mgr||' = '||  mytotal );
END;
/