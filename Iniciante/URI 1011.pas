uses Math;

const
    pi = 3.14159;

var
	raio : double;
	volume : double;

begin
    read(raio);
	
    volume := (4.0 / 3) * pi * power(raio, 3.0);
	
    writeln('VOLUME = ', volume:0:3);
end.