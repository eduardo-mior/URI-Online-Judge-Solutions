var
    inicio : int64;
    final : int64;

begin
    readLn(inicio, final);
	
	if ((inicio >= 0) and (final <= 2)) then
		writeln('nova')
	else if ((final > inicio) and (final <= 96)) then
		writeln('crescente')
	else if ((inicio >= final) and (final <= 96)) then
		writeln('minguante')
	else 
		writeln('cheia')
end.