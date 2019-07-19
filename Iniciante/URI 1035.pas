var
    a : int64;
    b : int64;
    c : int64;
    d : int64;

begin
    readLn(a, b, c, d);
	
	if ((b > c) and (d > a) and (c > 0) and (d > 0) and ((c + d) > (a + b)) and (a mod 2 = 0)) then
		writeln('Valores aceitos')
	else 
		writeln('Valores nao aceitos')
end.