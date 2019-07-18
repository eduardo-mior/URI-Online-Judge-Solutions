var
    L : int64;
    C : int64;
    lajes1 : int64;
    lajes2 : int64;

begin
    read(L);
    read(C);
	
    lajes1 := (L * C) + ((L - 1) * (C - 1));
    lajes2 := ((L - 1) * 2) + ((C - 1) * 2);
	
    writeln(lajes1);
    writeln(lajes2);
end.