child_of('joe', ralf).
child_of(mary, 'Joe').
child_of(steve, 'Joe').
descendent_of(X, Y) :-
    child_of(X, Y).
descendent_of(X, Y) :-
    child_of(Z, Y),
    descendent_of(X, Z).