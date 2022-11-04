let match0A list =
  let [_;_;x;_;_] = list
  in x;;

let match0B list =
  let [_; (x, _)] = list
  in x;;



match0A [-2; -1; 0; 1; 2];;
match0B [(1, 2); (0, 1)];;
