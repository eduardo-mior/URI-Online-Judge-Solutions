program uri_1157;
uses crt;

var Entrada,Contador : integer;

BEGIN
	readln(Entrada);
	for contador:=1 to Entrada do
		begin
			if (entrada mod contador) = 0
			then writeln(contador);
		end;
	
END.

