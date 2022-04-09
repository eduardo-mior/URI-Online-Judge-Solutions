program uri_1158;

uses crt;
var N,x,c1,c2: longint;
	y,resultado,hmm : longint;

BEGIN
	readln(N);
	for c1:=1 to N do
		begin
			readln(x,y);
			c2:=0;
			resultado:=0;
			
			while c2 < Y do
				begin
					if(x mod 2 <> 0)
					then 
						begin
							hmm:= x;
							resultado:= resultado + hmm;
							c2:= c2+1;
						end;
					
					x:=x+1;
				end;
				clrscr;
			writeln(resultado);
		end;	
END.
