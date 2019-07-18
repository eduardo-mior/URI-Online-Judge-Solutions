var
    valor1 : int64;
    valor2 : int64;
    valor3 : int64;

begin
    readLn(valor1, valor2, valor3);
	
	if ((valor1 > valor2) and (valor1 > valor3)) then
		writeln(valor1, ' eh o maior')
	else if (valor2 > valor3) then
		writeln(valor2, ' eh o maior')
	else 
		writeln(valor3, ' eh o maior')
end.