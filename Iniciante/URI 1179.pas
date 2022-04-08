program uri_1179;

uses crt;
var par: array [0..4] of Longint;
var impar: array [0..4] of Longint;
var r,cont,indice_par,indice_impar: Longint;

BEGIN
	indice_par:= 0;
	indice_impar:=0;
	
	for cont:=0 to 14 do
		begin
		
			if indice_par = 5
			then 
				begin
				
					for indice_par:=0 to 4 do
						begin
							writeln('par[',indice_par,'] = ',
									par[indice_par]);
						end;
					indice_par:= 0;
				end;
				
			if indice_impar = 5
			then
				begin
					
					for indice_impar:=0 to 4 do
						begin
							writeln('impar[',indice_impar,'] = ',
									impar[indice_impar]);
						end;
						indice_impar:=0;
				end;
				
				readln(r);
				
				
				if (r mod 2) = 0
				then 
					begin
						par[indice_par]:= r;
						indice_par:= indice_par + 1;
					end
				else
					begin
						impar[indice_impar]:= r;
						indice_impar:= indice_impar + 1;
					end;		
			end;
			
			indice_par:= indice_par-1;
			indice_impar:= indice_impar-1;
			
			
		for cont:=0 to indice_impar do
			begin
				writeln('impar[',cont,'] = ',
								impar[cont]);
			end;
			
		for cont:=0 to indice_par do
			begin
				writeln('par[',cont,'] = ',
								par[cont]);
			end;
END.
