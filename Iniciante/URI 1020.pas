program uri_1020;
uses crt;
const
	ano = 365;
	mes = 30;
	lnb = #13#10;
var
	anos,meses,dias : real;

BEGIN
	readln(dias);
	anos:= trunc(dias/ano);
	dias:= dias - (anos*ano);
	meses:= trunc(dias/mes);
	dias:= dias - (meses*mes);
	writeln(anos:0:0,' ano(s)',lnb,
			meses:0:0,' mes(es)',lnb,
			dias:0:0,' dia(s)');
END.
