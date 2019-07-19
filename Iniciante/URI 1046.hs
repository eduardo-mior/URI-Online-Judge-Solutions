main :: IO ()
main = do
    line <- getLine
    let (hInicial:hFinal:_) = map (read :: String -> Int) $ words line
    if hInicial > hFinal
        then putStrLn $ "O JOGO DUROU " ++ show (24 - (hInicial - hFinal)) ++ " HORA(S)"
    else if hFinal > hInicial
        then putStrLn $ "O JOGO DUROU " ++ show (hFinal - hInicial) ++ " HORA(S)"
    else
        putStrLn $ "O JOGO DUROU 24 HORA(S)"