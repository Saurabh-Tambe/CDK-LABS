DECLARE 
   c number(2); 
BEGIN 
   c := totaldepts(); 
   dbms_output.put_line('Total no. of Departments: ' || c); 
END; 
/