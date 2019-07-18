var
    a : int64;
    b : int64;

begin
    readLn(a, b);
	
	if ((a mod b = 0) or (b mod a = 0)) then
		writeln('Sao Multiplos')
	else 
		writeln('Nao sao Multiplos')
end.