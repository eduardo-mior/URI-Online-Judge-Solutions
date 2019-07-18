uses Math;

var
	x1 : double;
	y1 : double;
	x2 : double;
	y2 : double;
	distancia : double;

begin
    readLn(x1, y1);
    readLn(x2, y2);

    distancia := sqrt(power((x2 - x1), 2.0) + power((y2 - y1), 2.0));

    writeln(distancia:0:4);
end.