# Assignmetn-Head-and-Tail-

The head and tail methods are defined only for non-empty lists. When selected
from an empty list, they throw an exception.


As an example of how lists can be processed, consider sorting the elements of a list
of numbers into ascending order. One simple way to do so is insertion sort, which
works as follows: To sort a non-empty list with first element x and rest xs, sort the
remainder xs and insert the element x at the right position in the result. Sorting an
empty list will yield an empty list. Expressed as Scala code:


def isort(xs: List[Int]): List[Int] =
 if (xs.isEmpty) Nil
 else insert(xs.head, isort(xs.tail))



Provide an implementation of the missing function insert.
