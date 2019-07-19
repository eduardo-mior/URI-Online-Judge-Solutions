var
	salario : double;

begin
    read(salario);
	if ((salario >= 0.0) and (salario <= 2000.0)) then 
		writeln('Isento')
	else if ((salario > 2000.0) and (salario <= 3000.0)) then
		writeln('R$ ', ((salario - 2000.0) * 0.08):0:2)
	else if ((salario > 3000.0) and (salario <= 4500.0)) then
		writeln('R$ ', (((salario - 3000.0)  * 0.18) + 80):0:2)
	else
		writeln('R$ ', (((salario - 4500.0) * 0.28) + 350):0:2)
end.