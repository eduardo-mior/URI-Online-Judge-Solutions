program uri_1039;
uses SysUtils;
var r1,x1,y1,r2,x2,y2,x,y,d : real;
	
	

BEGIN
	

	
	
	while not eof do
		begin
			readln(r1,x1,y1,r2,x2,y2);
			
			
			
			x:= (x2 - x1) * (x2 - x1);
			y:= (y2 - y1) * (y2 - y1);
			d:= sqrt(x+y);
	
			if (r1) < (r2)
			then writeln('MORTO')
			else if (r2 + d) <= (r1) then writeln('RICO')
			else writeln('MORTO');
		end;
	
	
END.

