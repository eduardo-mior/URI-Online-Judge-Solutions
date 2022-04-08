program uri_1036;

uses crt;
var A,B,C,Delta,R1,R2 : real;

BEGIN
	readln(a,b,c);
	
	Delta:= b*b -4*a*c;
	
	if (a = 0) or (Delta < 0)
		then 
		writeln('Impossivel calcular')			
		
		else
			begin
				R1:= (-b + sqrt(Delta))/(2*a);
				writeln('R1 = ',R1:0:5);
			
				R2:= (-b - sqrt(Delta))/(2*a);
				writeln('R2 = ',R2:0:5);
			end;
			
	
END.
