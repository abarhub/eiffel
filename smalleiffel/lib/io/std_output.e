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
class STD_OUTPUT
--
-- To use the standard output file. As for UNIX, the default standard
-- output is the screen.
--
-- Notes: - the predefined `std_output' should be use to have only one instance
--        of the class STD_OUTPUT,
--        - to do reading or writing at the same time on the screen,
--        see STD_INPUT_OUTPUT,
--

inherit OUTPUT_STREAM;

creation make

feature

   is_connected: BOOLEAN is true;

feature

   make is
      do
      end;

feature

   put_character(c: CHARACTER) is
      do
         basic_io_putc(c,basic_io_stdout);
      end;

   flush is
      do
         basic_io_flush(basic_io_stdout);
      end;

feature {NONE}

   basic_io_stdout: POINTER is
      external "SmallEiffel"
      end;

end -- STD_OUTPUT

