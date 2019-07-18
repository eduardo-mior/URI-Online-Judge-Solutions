main :: IO ()
main = do
    a' <- getLine
    b' <- getLine

    let a = read a' :: Int
    let b = read b' :: Int
    let soma = a + b :: Int

    putStrLn $ "SOMA = " ++ show soma