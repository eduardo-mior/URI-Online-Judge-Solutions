var
    raio : double;
    area : double;

begin
    read(raio);
	
    area := 3.14159 * (raio * raio);
	
    writeln('A=', area:0:4);
end.