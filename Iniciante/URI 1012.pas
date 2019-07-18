var
	a : double;
	b : double;
	c : double;
	triangulo : double;
	circulo : double;
	trapezio : double;
	quadrado : double;
	retangulo : double;

begin
    readLn(a, b, c);
	
	triangulo := a * c / 2.0;
	circulo := 3.14159 * (c * c);
	trapezio := ((a + b) * c) / 2.0;
	quadrado := b * b;
	retangulo := a * b;
    
    writeln('TRIANGULO: ', triangulo:0:3);
    writeln('CIRCULO: ', circulo:0:3);
    writeln('TRAPEZIO: ', trapezio:0:3);
    writeln('QUADRADO: ', quadrado:0:3);
    writeln('RETANGULO: ', retangulo:0:3);
end.