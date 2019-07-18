var
    cod1 : int64;
    cod2 : int64;
    n1 : int64;
    n2 : int64;
	valor1 : double;
	valor2 : double;
	total : double;

begin
    readLn(cod1, n1, valor1);
    readLn(cod2, n2, valor2);
	
    total := (n1 * valor1) + (n2 * valor2);
	
    writeln('VALOR A PAGAR: R$ ', total:0:2);
end.