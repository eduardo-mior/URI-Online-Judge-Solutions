var
    valor : double;

begin
    read(valor);
    
    if ((valor >= 0) and (valor <= 25)) then
        writeln('Intervalo [0,25]')
    else if ((valor > 25) and (valor <= 50)) then
        writeln('Intervalo (25,50]')
    else if ((valor > 50) and (valor <= 75)) then
        writeln('Intervalo (50,75]')
    else if ((valor > 75) and (valor <= 100)) then
        writeln('Intervalo (75,100]')
    else
        writeln('Fora de intervalo')
end.