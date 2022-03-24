program uri_2840;

var r,gas,total: longint;
	volume : double;
BEGIN
	readln(r,gas);
	volume:= (4*3.1415*((r*r)*r)/3);
	total:= trunc(gas/volume);
	writeln(total);
	
END.

