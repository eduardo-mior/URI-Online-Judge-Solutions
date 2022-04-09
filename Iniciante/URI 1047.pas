program uri_1047;
uses crt;

var h1,m1,h2,m2,ht,mt : integer;

BEGIN
	readln(h1,m1,h2,m2);
	ht:= h2 - h1;
	mt:= m2 - m1;
	
	if (mt < 0)
	then begin mt:= 60 + mt; ht:= ht-1 end;
	if (ht < 0)
	then ht := 24 + ht;
	if (h1 = h2) and (m1 = m2)
	then writeln('O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)')
	else writeln('O JOGO DUROU ',ht,' HORA(S) E ',mt,' MINUTO(S)')
	
	
END.
