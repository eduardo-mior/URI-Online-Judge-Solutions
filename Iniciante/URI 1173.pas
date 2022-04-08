program uri_1173;
uses crt;
var N: array [0..9] of integer;
	indice,v: integer;

BEGIN
	readln(v);
	N[0]:=v;
	for indice:= 1 to 9 do
		begin
			v:= v * 2;
			N[indice]:=v;
		end;
	for indice:= 0 to 9 do
		begin
			writeln('N[',indice,'] = ',n[indice]);
		end;
END.

