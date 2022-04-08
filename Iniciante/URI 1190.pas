program uri_1190;

var l,c : integer;
	letra : string;
	soma,media : double;
	Matriz: array [0..11,0..11] of double;

BEGIN

	readln(letra);
	soma:= 0;
	media:= 0;
	
	for l:= 0 to 11 do
		begin
			for c:= 0 to 11 do
				begin
					readln(Matriz[l,c]);
				end;
		end;
		
	for l:= 1 to 10 do
		begin
			for c:= 7 to 11 do
				begin
					if ((l + c) > 11) and ((l - c) < 0)
					then begin soma:= soma + matriz[l,c] end;
				end;
		end;
		
	media:= soma/30;
	
	
	if letra = 'S'
	then begin writeln(soma:0:1); end;
	if letra = 'M'
	then begin writeln(media:0:1); end;
	
	
END.
