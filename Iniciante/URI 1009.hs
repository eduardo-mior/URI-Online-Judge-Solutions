import Text.Printf

main :: IO ()
main = do
    nome' <- getLine
    salarioFixo' <- getLine
    vendas' <- getLine

    let nome = read nome' :: String
    let salarioFixo = read salarioFixo' :: Double
    let vendas = read vendas' :: Double
    let total = ((vendas * 15) / 100) + salarioFixo

    putStrLn $ printf "TOTAL = R$ %.2f" total