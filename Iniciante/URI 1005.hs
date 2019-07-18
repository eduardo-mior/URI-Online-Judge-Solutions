import Text.Printf

main :: IO ()
main = do
    a' <- getLine
    b' <- getLine

    let a = read a' :: Double
    let b = read b' :: Double
    let media = ((3.5 * a) + (7.5 * b)) / 11

    putStrLn $ printf "MEDIA = %.5f" media