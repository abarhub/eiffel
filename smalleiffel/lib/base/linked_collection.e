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
deferred class LINKED_COLLECTION[E]
   --
   -- Common root of LINKED_LIST and TWO_WAY_LINKED_LIST.
   --

inherit COLLECTION[E];

feature

   lower: INTEGER is 1;
         -- Lower index bound is frozen.

   upper: INTEGER;
         -- Memorized upper index bound.

end -- LINKED_COLLECTION[E]

