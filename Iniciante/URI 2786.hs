main :: IO ()
main = do
    l' <- getLine
    c' <- getLine

    let l = read l' :: Int
    let c = read c' :: Int
    let lajes1 = (l * c) + ((l - 1) * (c - 1)) :: Int
    let lajes2 = ((l - 1) * 2) + ((c - 1) * 2) :: Int

    putStrLn $ show lajes1
    putStrLn $ show lajes2