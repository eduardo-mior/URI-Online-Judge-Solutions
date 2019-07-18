var
    a : double;
    b : double;
    c : double;
    media: double;

begin
    read(a);
    read(b);
    read(c);
	
    media := ((a * 2) + (b * 3) + (c * 5)) / 10;
	
    writeln('MEDIA = ', media:0:1);
end.