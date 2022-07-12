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
expanded class CLOCK
--
-- Time and date facilities: year, month, day, hour and seconds.
--

feature

   value: INTEGER is
	 -- Get the CPU clock periods if available (-1 if not).
      do
         Result := basic_clock;
      end;

   periods_per_second: INTEGER is
	 --  The number of clock periods per seconds.
      require
	 value >= 0
      do
	 Result := basic_clock_per_sec;
      end;

feature {NONE}

   basic_clock: INTEGER is
      external "SmallEiffel"
      end;

   basic_clock_per_sec: INTEGER is
      external "SmallEiffel"
      end;

end -- CLOCK
