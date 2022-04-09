program uri_1038;
uses crt;
const
	c1 = 4.00;
	c2 = 4.50;
	c3 = 5.00;
	c4 = 2.00;
	c5 = 1.50;
	
var codigo,unidade : integer;

BEGIN
	readln(codigo,unidade);
	case codigo of
	1: writeln('Total: R$ ',c1*unidade:0:2);
	2: writeln('Total: R$ ',c2*unidade:0:2);
	3: writeln('Total: R$ ',c3*unidade:0:2);
	4: writeln('Total: R$ ',c4*unidade:0:2);
	5: writeln('Total: R$ ',c5*unidade:0:2);
	end;
END.

