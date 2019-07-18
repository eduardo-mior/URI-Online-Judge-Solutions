import Text.Printf

main :: IO ()
main = do
    funcionarios' <- getLine
    horas' <- getLine
    valorPorHora' <- getLine

    let funcionarios = read funcionarios' :: Int
    let horas = read horas' :: Double
    let valorPorHora = read valorPorHora' :: Double
    let salario = horas * valorPorHora

    putStrLn $ "NUMBER = " ++ show funcionarios
    putStrLn $ printf "SALARY = U$ %.2f" salario