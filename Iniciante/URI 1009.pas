var
    nome : string;
	salarioFixo : double;
	vendas : double;
	total : double;

begin
    read(nome);
    read(salarioFixo);
	read(vendas);
	
    total := ((vendas * 15) / 100) + salarioFixo;
    
	writeln('TOTAL = R$ ', total:0:2);
end.