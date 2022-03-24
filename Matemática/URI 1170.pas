var qtd,indice,tempo : longint;
comida : real;
dias: array [1..1000] of longint;

BEGIN
	readln(qtd);
	
	for indice:=1 to qtd do
		begin
		readln(comida);
		tempo:= 0;
			while comida > 1.0 do
				begin
					comida:= comida/2;
					tempo:= tempo+1;
				end;
				
		dias[indice]:= tempo;
		
		end;
		for indice:=1 to qtd do
		begin
		writeln(dias[indice],' dias');
		end;
END.
