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
expanded class TIME_IN_FRENCH
--
-- The French format class for class TIME.
--

inherit TIME_IN_SOME_LANGUAGE;

feature

   day_in(buffer: STRING) is
      local
         s: STRING;
      do
         if short_mode then
            inspect
               time.week_day
            when 0 then
               s := "Dim";
            when 1 then
               s := "Lun";
            when 2 then
               s := "Mar";
            when 3 then
               s := "Mer";
            when 4 then
               s := "Jeu";
            when 5 then
               s := "Ven";
            when 6 then
               s := "Sam";
            end;
         else
            inspect
               time.week_day
            when 0 then
               s := "Dimanche";
            when 1 then
               s := "Lundi";
            when 2 then
               s := "Mardi";
            when 3 then
               s := "Mercredi";
            when 4 then
               s := "Jeudi";
            when 5 then
               s := "Vendredi";
            when 6 then
               s := "Samedi";
            end;
         end;
         buffer.append(s);
      end;

   month_in(buffer: STRING) is
      local
         s: STRING;
      do
         if short_mode then
            inspect
               time.month
            when 1 then
               s := "Jan";
            when 2 then
               s := "Fev";
            when 3 then
               s := "Mar";
            when 4 then
               s := "Avr";
            when 5 then
               s := "Mai";
            when 6 then
               s := "Juin";
            when 7 then
               s := "Juil"
            when 8 then
               s := "Aout"
            when 9 then
               s := "Sept"
            when 10 then
               s := "Oct";
            when 11 then
               s := "Nov";
            when 12 then
               s := "Dec";
            end;
         else
            inspect
               time.month
            when 1 then
               s := "Janvier";
            when 2 then
               s := "Fevrier";
            when 3 then
               s := "Mars";
            when 4 then
               s := "Avril";
            when 5 then
               s := "Mai";
            when 6 then
               s := "Juin";
            when 7 then
               s := "Juillet"
            when 8 then
               s := "Aout"
            when 9 then
               s := "Septembre"
            when 10 then
               s := "Octobre";
            when 11 then
               s := "Novembre";
            when 12 then
               s := "Decembre";
            end;
         end;
         buffer.append(s);
      end;

   append_in(buffer: STRING) is
      do
         day_in(buffer);
         buffer.extend(' ');
         time.day.append_in(buffer);
         buffer.extend(' ');
         month_in(buffer);
         buffer.extend(' ');
         if short_mode then
            (time.year \\ 100).append_in(buffer);
         else
            time.year.append_in(buffer);
         end;
         buffer.extend(' ');
         time.hour.append_in(buffer);
         buffer.extend('h');
         time.minute.append_in(buffer);
         buffer.extend('m');
         if not short_mode then
            time.second.append_in(buffer);
            buffer.extend('s');
         end;
      end;

end
