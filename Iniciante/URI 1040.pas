program uri_1040;
uses crt;
const	lnb = #13#10;
var		n1,n2,n3,n4,nF,media,mediaF : real;

begin
	readln(n1,n2,n3,n4);
	
	media := (n1*0.2 + n2*0.3 + n3*0.4 + n4*0.1);
	media := int(media*100)/100;
	
	if ((media) <= 6.9)
		then if ((media) >= 5.0)
			then
				begin
			
				readln(nF);
				mediaF:= (media + nf)/2;
				mediaF := int(mediaF*100)/100;	
				
				writeln('Media: ',media:0:1,lnb,'Aluno em exame.');
				writeln('Nota do exame: ', nF:0:1);
				
				if (mediaF >= 5.0)
					then writeln('Aluno aprovado.')
					else writeln('Aluno reprovado.');
				writeln('Media final: ', mediaF:0:1);
				end;
				
		if((media) <= 4.9)
			then writeln('Media: ',media:0:1,lnb,'Aluno reprovado.');
		if((media) >= 7.0)
			then writeln('Media: ', media:0:1,lnb,'Aluno aprovado.');
	
end.
