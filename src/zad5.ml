let rec initSegment l =
     match l with
       ([], _) -> true
      |(_, []) -> false
      | (x, y) when (List.hd x) = (List.hd y) -> initSegment((List.tl x), (List.tl y))
      | _ -> false;;

initSegment ([1;3;5;7],[1;3;5;7]);;
initSegment ([],[1;3;5;7]);;
initSegment ([1;3;5;7],[]);;
initSegment ([1;3;5;7],[1;2;5;7]);;
