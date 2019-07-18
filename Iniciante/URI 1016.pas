var
    km : int64;
    minutos : double;

begin
    read(km);
	
    minutos := (60 * km) / 30;
	
    writeln(minutos:0:0, ' minutos');
end.