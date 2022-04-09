program uri_1172;
uses crt;
var valores: array [1..10] of integer;
	indice,contador,N : integer;

BEGIN

	for indice:= 1 to 10 do
		begin
			readln(n);
			if n <= 0
				then 
					begin
						valores[indice]:= 1;
					end
			else
				valores[indice]:= n;
		end;
		
	contador:= 0;
	
	for indice:=1 to 10 do
		begin
			writeln('X[',contador,'] = ',valores[indice]);
			contador:= contador + 1;
		end;
	
END.

