import Text.Printf

main :: IO ()
main = do
    salario' <- getLine
    let salario = read salario' :: Double
    if (salario >= 0.0 && salario <= 2000.0)
        then putStrLn $ "Isento"
    else if (salario > 2000.0 && salario <= 3000.0)
        then putStrLn $ printf "R$ %.2f" ((salario - 2000.0) * 0.08)
    else if (salario > 3000.0 && salario <= 4500.0)
        then putStrLn $ printf "R$ %.2f" (((salario - 3000.0)  * 0.18) + 80)
    else 
        putStrLn $ printf "R$ %.2f" (((salario - 4500.0) * 0.28) + 350)