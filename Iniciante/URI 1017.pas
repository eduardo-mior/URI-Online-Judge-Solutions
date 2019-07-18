var
    tempo : int64;
    velocidade : int64;
	kilometros : double;
	media : double;

begin
    read(tempo);
    read(velocidade);
	
    kilometros := tempo * velocidade;
    media := kilometros / 12;
    
    writeln(media:0:3);
end.