var
    a : double;
    b : double;
    media: double;

begin
    read(a);
    read(b);
	
    media := ((3.5 * a) + (7.5 * b)) / 11;
	
    writeln('MEDIA = ', media:0:5);
end.