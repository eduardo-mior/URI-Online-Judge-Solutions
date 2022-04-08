program uri_1182;

var coluna,l,c : integer;
	letra : string;
	soma,media : double;
	Matriz: array [0..11,0..11] of double;

BEGIN

	readln(coluna);
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
	
	for l:= 0 to 11 do
		begin
			soma:= soma + matriz[l,coluna];
		end;
		
	media:= soma/12;
	
	if letra = 'S'
	then begin writeln(soma:0:1); end;
	if letra = 'M'
	then begin writeln(media:0:1); end;
	
	
END.


