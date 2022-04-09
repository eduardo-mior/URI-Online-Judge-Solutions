program uri_1021;
uses crt;
const
	N100 = 100;
	N50	 =	50;
	N20	 =  20;
	N10  =  10;
	N5   =   5;
	N2   =   2;
	N1   =   1;
	M1 	 = 100;
	M050 =  50;
	M025 =  25;
	M010 =  10;
	M005 =   5;
	M001 =   1;
	lnb  = #13#10;
var

	EntradaN,atual,atualm,tn100,tn50,tn20,tn10,tn5,tn2,tn1,tm050,tm025,tm010,tm005,tm001 : integer;
	Entrada,EntradaM : real;

BEGIN
	readln(Entrada);
	EntradaN:= Trunc(Entrada);
	EntradaM:= frac(Entrada);
	
	//Calculo de Notas
	atual:= entradaN;
	
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
	//Fim Calculo de Notas
	
	//Calculo de Moedas
	atualM:= trunc(entradaM*100);

	tm050:= atualm div M050;
	atualm:= atualm mod M050;
	
	tm025:= atualm div M025;
	atualm:= atualm mod M025;
	
	tm010:= atualm div M010;
	atualm:= atualm mod M010;
	
	tm005:= atualm div M005;
	atualm:= atualm mod M005;

	tm001:= atualm div M001;
	atualm:= atualm mod M001;
	//Fim Calculo de Moedas
	
	writeln('NOTAS:',lnb,
	tn100,' nota(s) de R$ 100.00',lnb,
	tn50,' nota(s) de R$ 50.00',lnb,
	tn20,' nota(s) de R$ 20.00',lnb,
	tn10,' nota(s) de R$ 10.00',lnb,
	tn5,' nota(s) de R$ 5.00',lnb,
	tn2,' nota(s) de R$ 2.00');
	
	writeln('MOEDAS:',lnb,
	tn1,  ' moeda(s) de R$ 1.00',lnb,
	tm050,' moeda(s) de R$ 0.50',lnb,
	tm025,' moeda(s) de R$ 0.25',lnb,
	tm010,' moeda(s) de R$ 0.10',lnb,
	tm005,' moeda(s) de R$ 0.05',lnb,
	tm001,' moeda(s) de R$ 0.01');
	
		
END.
