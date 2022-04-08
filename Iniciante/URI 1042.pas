program uri_1042;
uses crt;

var a,b,c,d,e,f : integer;

BEGIN
	readln(a,b,c);
	
	begin
	if (a < b) and (a < c)
	then d:=a;
	if (b < a) and (b < c)
	then d:=b;
	if (c < a) and (c < b)
	then d:=c;
	
	if (a > b) and (a > c)
	then f:=a;
	if (b > a) and (b > c)
	then f:=b;
	if (c > a) and (c > b)
	then f:=c;
	
	if (a > d) and (a < f)
	then e:=a;
	if (b > d) and (b < f)
	then e:=b;
	if (c > d) and (c < f)
	then e:=c;
	end;
	
	writeln(d);
	writeln(e);
	writeln(f);
	writeln('');
	writeln(a);
	writeln(b);
	writeln(c);
	
	
END.

