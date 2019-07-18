uses Math;

var
	N : double;
	resposta : double;

begin
    readLn(N);

    resposta := (power(N, 4.0) - (6.0 * power(N, 3.0)) + (23.0 * power(N, 2.0)) - (18.0 * N) + 24.0 ) / 24.0;

    writeln(resposta:0:0);
end.