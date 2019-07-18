var
    a : int64;
    b : int64;
    c : int64;
    d : int64;
    diferenca : int64;

begin
    read(a);
    read(b);
    read(c);
    read(d);
	
    diferenca := a * b - c * d;
	
    writeln('DIFERENCA = ', diferenca);
end.