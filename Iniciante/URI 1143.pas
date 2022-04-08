program uri_1143;
var Num,Numq,Numcub,Cont : real;
BEGIN
	readln(Num);
	cont:= 1;
	while cont <> (Num + 1) do
		begin
		numq:= (cont)*(cont);
		numcub:= (cont)*(cont)*(cont);
		writeln(trunc(cont),' ',trunc(numq),' ',trunc(numcub));
		cont:= cont+1;
		end;	
END.
