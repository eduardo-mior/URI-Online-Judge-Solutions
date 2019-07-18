import Text.Printf

main = do
    line1 <- getLine
    line2 <- getLine

    let (cod1:n1:valor1:_) = map (read :: String -> Double) $ words line1
    let (cod2:n2:valor2:_) = map (read :: String -> Double) $ words line2
    let total = (n1 * valor1) + (n2 * valor2)

    putStrLn $ printf "VALOR A PAGAR: R$ %.2f" total