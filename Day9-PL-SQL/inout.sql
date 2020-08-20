DECLARE 
   a number; 
   b number; 
   min1 number;
   c number; 
    FUNCTION findMax(x IN number, y IN number, min OUT number,)  RETURN number 
	--number findmax(x number,y number)
		IS 
		z number; 
		BEGIN 
		IF x > y THEN 
			z:= x; 
			min := y;
		ELSE 
			Z:= y; 
			min :=x;
		END IF;  
		RETURN z; 
	END; 
BEGIN 
   a:= 20; 
   b:= 50;  
   --min1:= 0;
   c := findMax(a, b, min1); 
   dbms_output.put_line(' Maximum of (20,50): ' || c); 
   dbms_output.put_line(' Minimum of (20,50): ' || min1); 
END; 
/ 