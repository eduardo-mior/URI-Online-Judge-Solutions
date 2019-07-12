var
    funcionarios : int64;
    horas : int64;
	valorPorHora : double;
	salario : double;

begin
    read(funcionarios);
    read(horas);
	read(valorPorHora);
	
    salario := horas * valorPorHora;
    
	writeln('NUMBER = ', funcionarios);
	writeln('SALARY = U$ ', salario:0:2);
end.