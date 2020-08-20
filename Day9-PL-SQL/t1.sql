DECLARE
 message varchar2(100);
 mytotal number(2) ;
BEGIN
  message := 'Hello World';
  mytotal := totaldepts();
  dbms_output.put_line(message ||' from PL/SQL and count =   ' ||mytotal );
END;
/