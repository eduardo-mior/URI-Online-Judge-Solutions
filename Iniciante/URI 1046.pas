var
	hInicial : int64;
	hFinal : int64;

begin
    readLn(hInicial, hFinal);
	if (hInicial > hFinal) then
		writeln('O JOGO DUROU ', (24 - (hInicial - hFinal)), ' HORA(S)')
	else if (hFinal > hInicial) then
		writeln('O JOGO DUROU ',  (hFinal - hInicial), ' HORA(S)')
	else
		writeln('O JOGO DUROU 24 HORA(S)')
end.