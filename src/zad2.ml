let rec fib n =
  match n with
    0 -> 0
   |1->1
   |n when n>1 -> fib(n-1)+fib(n-2)
   |_ -> raise (Failure "match error");;

fib(-1);;
fib(40);;

let fibTail n =
  if (n<=0) then raise (Failure "match error")
  else  
  let rec fibTail_rec i j x =
    if x=0 then (i+j)
    else fibTail_rec j (i+j) (x-1)
  in fibTail_rec 0 1 (n-2);;

fibTail -1;;
fibTail 40;;
