-- This file is  free  software, which  comes  along  with  SmallEiffel. This
-- software  is  distributed  in the hope that it will be useful, but WITHOUT
-- ANY  WARRANTY;  without  even  the  implied warranty of MERCHANTABILITY or
-- FITNESS  FOR A PARTICULAR PURPOSE. You can modify it as you want, provided
-- this header is kept unaltered, and a notification of the changes is added.
-- You  are  allowed  to  redistribute  it and sell it, alone or as a part of
-- another product.
--       Copyright (C) 1994-2002 LORIA - INRIA - U.H.P. Nancy 1 - FRANCE
--          Dominique COLNET and Suzanne COLLIN - SmallEiffel@loria.fr
--                       http://SmallEiffel.loria.fr
--
class SET_NODE[E->HASHABLE]
   --
   -- Auxilliary class to implement SET[E->HASHABLE].
   --

creation {SET} make

feature {SET}

   item: E;

   next: like Current;
	 -- The `next' one when some clash occurs.

   set_next(n: like next) is
      do
         next := n;
      ensure
         next  = n
      end;

feature {NONE}

   make(i: like item; n: like next) is
      do
         item := i;
         next := n;
      ensure
         item = i;
         next = n
      end;

end
