program uri_1018;
uses crt;
const
	N100 = 100;
	N50	 =	50;
	N20	 =  20;
	N10  =  10;
	N5   =   5;
	N2   =   2;
	N1   =   1;
	lnb  = #13#10;
var
	Entrada,atual,tn100,tn50,tn20,tn10,tn5,tn2,tn1 : integer;

BEGIN
	readln(Entrada);
	
	atual:= entrada;
	
	tn100:= atual div N100;
	atual:= atual mod N100;
	
	tn50:= atual div N50;
	atual:= atual mod N50;
	
	tn20:= atual div N20;
	atual:= atual mod N20;
	
	tn10:= atual div N10;
	atual:= atual mod N10;
	
	tn5:= atual div N5;
	atual:= atual mod N5;
	
	tn2:= atual div N2;
	atual:= atual mod N2;
	
	tn1:= atual div N1;
	atual:= atual mod N1;
	
	writeln(Entrada,lnb,
	tn100,' nota(s) de R$ 100,00',lnb,
	tn50,' nota(s) de R$ 50,00',lnb,
	tn20,' nota(s) de R$ 20,00',lnb,
	tn10,' nota(s) de R$ 10,00',lnb,
	tn5,' nota(s) de R$ 5,00',lnb,
	tn2,' nota(s) de R$ 2,00',lnb,
	tn1,' nota(s) de R$ 1,00');
		
END.
