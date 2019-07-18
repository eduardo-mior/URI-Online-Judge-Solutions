var
    x : int64;
	y : double;
	media : double;

begin
    read(x);
    read(y);
	
    media := x / y;
	
    writeln(media:0:3, ' km/l');
end.