var
	x : double;
	y : double;

begin
    readLn(x, y);
	if ((x = 0) and (y = 0)) then
		writeln('Origem')
	else if (x = 0) then
		writeln('Eixo Y')
	else if (y = 0) then
		writeln('Eixo X')
	else if ((y > 0) and (x > 0)) then
		writeln('Q1')
	else if ((y > 0) and (x < 0)) then
		writeln('Q2')
	else if ((y < 0) and (x < 0)) then
		writeln('Q3')
	else if ((y < 0) and (x > 0)) then
		writeln('Q4')
end.