let root3 a =
  let rec root3_rec n x =
    if abs_float(x*.x*.x -. n) < (0.00000000000001*.abs_float(n)) then x
    else root3_rec n  (x+.(n/.(x*.x)-.x)/.3.0)
  in (
  if a>1.0 then root3_rec a (a/. 3.0)
  else root3_rec a a );;

root3 217.0;;
