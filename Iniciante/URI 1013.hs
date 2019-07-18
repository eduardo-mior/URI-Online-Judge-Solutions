main :: IO ()
main = do
    line <- getLine
    let (valor1:valor2:valor3:_) = map (read :: String -> Int) $ words line

    if valor1 > valor2 && valor1 > valor3
        then putStrLn $ show valor1 ++ " eh o maior"
    else if valor2 > valor3
        then putStrLn $ show valor2 ++ " eh o maior"
    else
        putStrLn $ show valor3 ++ " eh o maior"