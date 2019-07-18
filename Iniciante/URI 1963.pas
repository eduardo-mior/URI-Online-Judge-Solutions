var
	A : double;
	B : double;
	aumento : double;

begin
    readLn(A, B);

    aumento := (B * 100.0 / A) - 100.0;

    writeln(aumento:0:2, '%');
end.