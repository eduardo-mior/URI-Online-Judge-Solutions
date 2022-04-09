program uri_1050;
uses crt;
const d61 = 'Brasilia';
	  d71 = 'Salvador';
	  d11 = 'Sao Paulo';
	  d21 = 'Rio de Janeiro';
	  d32 = 'Juiz de Fora';
	  d19 = 'Campinas';
	  d27 = 'Vitoria';
	  d31 = 'Belo Horizonte';
var n : integer; 
	ddd: string;
BEGIN
	readln(n);
	case n of
	61: ddd:= d61;
	71: ddd:= d71;
	11: ddd:= d11;
	21: ddd:= d21;
	32: ddd:= d32;
	19: ddd:= d19;
	27: ddd:= d27;
	31: ddd:= d31;
	else ddd:='DDD nao cadastrado'
	end;
	writeln(ddd);
	
END.
