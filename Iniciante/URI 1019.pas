program uri_1019;
uses crt;

	
	var
	Entrada,Hora,Min,Seg : real;

BEGIN
	readln(entrada);
	hora:= trunc(entrada/3600);
	entrada:= entrada - (hora*3600);
	min:= trunc(entrada/60); 
	entrada:= entrada - (min*60);
	seg:= entrada;
	
	writeln(Hora:0:0,':',Min:0:0,':',Seg:0:0);
	
	
END.

