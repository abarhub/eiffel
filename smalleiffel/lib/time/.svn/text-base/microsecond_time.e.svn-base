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
expanded class MICROSECOND_TIME
--
-- Basic date and time facilities (like TIME) plus an extra
-- microsecond information.
--

inherit
   HASHABLE redefine is_equal end;
   COMPARABLE redefine is_equal end;

feature

   time: TIME;
	 -- To store year, month, day, hour and seconds.

   microsecond: INTEGER;
         -- Extra information in number of microseconds in range 0 .. 999999.
	 -- Note that the accuracy is system dependant.

   is_local_time: BOOLEAN is
         -- Is the local time in use? This information applies to all objects
         -- of class TIME and MICROSECOND_TIME.
      do
         Result := time.is_local_time;
      ensure
         Result implies not is_universal_time
      end;

   is_universal_time: BOOLEAN is
         -- Is Universal Time in use?  This information applies to all objects
         -- of class TIME and MICROSECOND_TIME.
      do
         Result := time.is_universal_time;
      ensure
         Result implies not is_local_time
      end;

   year: INTEGER is
         -- Number of the year.
      do
	 Result := time.year;
      end;

   month: INTEGER is
         -- Number of the month (1 for January, 2 for February, ...
         -- 12 for December).
      do
         Result := time.month;
      ensure
         Result.in_range(1,12)
      end;

   day: INTEGER is
         -- Day of the `month' in range 1 .. 31.
      do
         Result := time.day;
      ensure
         Result.in_range(1,31)
      end;

   hour: INTEGER is
         -- Hour in range 0..23.
      do
         Result := time.hour;
      ensure
         Result.in_range(0,23)
      end;

   minute: INTEGER is
         -- Minute in range 0 .. 59.
      do
         Result := time.minute;
      ensure
         Result.in_range(0,59)
      end;

   second: INTEGER is
         -- Second in range 0 .. 59.
      do
         Result := time.second;
      ensure
         Result.in_range(0,59)
      end;

   week_day: INTEGER is
         -- Number of the day in the week (Sunday is 0, Monday is 1, etc.).
      do
         Result := time.week_day;
      ensure
         Result.in_range(0,6)
      end;

   year_day: INTEGER is
         -- Number of the day in the year in range 0 .. 365.
      do
         Result := time.year_day;
      end;

   is_summer_time_used: BOOLEAN is
         -- Is summer time in effect? This information applies to all objects
         -- of class TIME and MICROSECOND_TIME.
      do
         Result := time.is_summer_time_used;
      end;

feature -- Setting:

   update is
         -- Update `Current' with the current system clock.
      do
         basic_microsecond_update;
	 time.set_time_memory(basic_microsecond_time);
	 microsecond := basic_microsecond_microsecond;
      end;

   set(a_year, a_month, a_day, a_hour, a_min, sec: INTEGER): BOOLEAN is
         -- Try to set `Current' using the given information. If this input
         -- is not a valid date, the `Result' is false and `Current' is not updated.
      require
	 valid_month: a_month.in_range(1,12);
	 valid_day: a_day.in_range(1,31);
	 valid_hour: a_hour.in_range(0,23);
	 valid_minute: a_min.in_range(0,59);
	 valid_second: sec.in_range(0,59)
      do
	 Result := time.set(a_year,a_month,a_day,a_hour,a_min,sec);
      end;

   set_microsecond(microsec: INTEGER) is
         -- To set `microsecond' in range 0 .. 999 999.
      require
	 microsec.in_range(0, 999_999)
      do
	 microsecond := microsec
      ensure
	 microsecond = microsec
      end

   infix "+" (s: DOUBLE): like Current is
	 -- Add `s' seconds (2.476 is 2 seconds and 476 milliseconds)
      require
	 s >= 0.0
      local
	 a, b: INTEGER
      do
	 a := s.truncated_to_integer;
	 b := ((s - a) * 1_000_000).truncated_to_integer;
	 Result := Current;
	 Result.add_second(a);
	 Result.add_microsecond(b);
      end

   add_second(s: INTEGER) is
	 -- Add `s' seconds to `Current'.
      require
	 s >= 0
      do
	 time.add_second(s);
      ensure
	 Current >= old Current
      end

   add_millisecond(millisecond: INTEGER) is
	 -- Add `millisecond' milliseconds.
      require
	 millisecond.in_range(0, 999)
      do
	 add_microsecond(millisecond * 1000);
      ensure
	 Current >= old Current
      end

   add_microsecond(microsec: INTEGER) is
	 -- Add `microsec' microseconds;
      require
	 microsec.in_range(0, 999_999)
      local
	 a: INTEGER;
      do
	 a := microsec + microsecond;
	 if a >= 1_000_000 then
	    add_second(1);
	    a := a - 1_000_000;
	 end
	 microsecond := a;
      ensure
	 Current >= old Current
      end

feature

   elapsed_seconds(other: like Current): INTEGER is
         -- Elapsed time in seconds from `Current' to `other'.
      do
         Result := time.elapsed_seconds(other.time)
	 if other.microsecond < microsecond then
	    Result := Result - 1;
	 end;
      end;

   elapsed_with_subsecond (other: like Current): DOUBLE is
         -- Elapsed time in seconds from `Current' to `other' with sub-second
	 -- precision.
      require
         Current <= other
      local
	 tm1, tm2: DOUBLE;
      do
	 tm1 := time.time_memory;
	 tm2 := other.time.time_memory;
         Result := basic_time_difftime(tm2,tm1);
	 Result := Result + ((other.microsecond - microsecond) / 1_000_000);
      ensure
         Result >= 0
      end;

   is_equal(other: like Current): BOOLEAN is
      do
	 if microsecond = other.microsecond then
	    Result := time.is_equal(other.time);
	 end;
      end;

   infix "<" (other: like Current): BOOLEAN is
      local
	 tm1, tm2: DOUBLE; sec: INTEGER
      do
	 tm1 := time.time_memory;
	 tm2 := other.time.time_memory;
         sec := basic_time_difftime(tm2,tm1);
	 Result := sec > 0 or else 
			(sec = 0 and then microsecond < other.microsecond);
      ensure
	 Result implies (elapsed_with_subsecond(other) > 0);
      end;

feature -- Setting common time mode (local or universal):

   set_universal_time is
      do
         time.set_universal_time;
      ensure
         is_universal_time
      end;

   set_local_time is
      do
         time.set_local_time;
      ensure
         is_local_time
      end;

feature -- Hashing:

   hash_code: INTEGER is
      do
         Result := time.hash_code;
      end;

feature {NONE}

   basic_microsecond_time: DOUBLE is
      external "SmallEiffel"
      end;

   basic_microsecond_microsecond: INTEGER is
      external "SmallEiffel"
      end;

   basic_microsecond_update is
      external "SmallEiffel"
      end;

   basic_time_difftime(time2, time1: DOUBLE): INTEGER is
      external "SmallEiffel"
      end;

invariant

   microsecond.in_range(0,999999);

end -- MICROSECOND_TIME
