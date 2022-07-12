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
expanded class TIME_IN_GERMAN
--
-- The German format class for class TIME.
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
               s := "So";
            when 1 then
               s := "Mo";
            when 2 then
               s := "Di";
            when 3 then
               s := "Mi";
            when 4 then
               s := "Do";
            when 5 then
               s := "Fr";
            when 6 then
               s := "Sa";
            end;
         else
            inspect
               time.week_day
            when 0 then
               s := "Sonntag";
            when 1 then
               s := "Montag";
            when 2 then
               s := "Dienstag";
            when 3 then
               s := "Mittwoch";
            when 4 then
               s := "Donnerstag";
            when 5 then
               s := "Freitag";
            when 6 then
               s := "Samstag";
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
               s := "Feb";
            when 3 then
               s := "Mär";
            when 4 then
               s := "Apr";
            when 5 then
               s := "Mai";
            when 6 then
               s := "Jun";
            when 7 then
               s := "Jul"
            when 8 then
               s := "Aug"
            when 9 then
               s := "Sep"
            when 10 then
               s := "Okt";
            when 11 then
               s := "Nov";
            when 12 then
               s := "Dez";
            end;
         else
            inspect
               time.month
            when 1 then
               s := "Januar";
            when 2 then
               s := "Februar";
            when 3 then
               s := "März";
            when 4 then
               s := "April";
            when 5 then
               s := "Mai";
            when 6 then
               s := "Juni";
            when 7 then
               s := "Juli"
            when 8 then
               s := "August"
            when 9 then
               s := "September"
            when 10 then
               s := "Oktober";
            when 11 then
               s := "November";
            when 12 then
               s := "Dezember";
            end;
         end;
         buffer.append(s);
      end;

   append_in(buffer: STRING) is
      local
         tmp: STRING;
      do
         day_in(buffer);
         buffer.extend(',');
         buffer.extend(' ');
         tmp := time.day.to_string;
         if 2 > tmp.count then
            tmp.insert_character('0',1);
         end
         buffer.append_string(tmp);
         buffer.append_string(". ");
         month_in(buffer);
         buffer.append_character(' ');
         if short_mode then
            tmp := (time.year \\ 100).to_string;
            if 2 > tmp.count then
               tmp.insert_character('0',1);
            end
            buffer.append_string(tmp);
         else
            time.year.append_in(buffer);
         end;
         buffer.extend(' ');
         tmp := time.hour.to_string;
         if 2 > tmp.count then
            tmp.insert_character('0',1);
         end
         buffer.append_string(tmp);
         buffer.append_character(':');
         tmp := time.minute.to_string;
         if 2 > tmp.count then
            tmp.insert_character('0',1);
         end
         buffer.append_string(tmp);
         buffer.append_character(':');
         if not short_mode then
            tmp := time.second.to_string;
            if 2 > tmp.count then
               tmp.insert_character('0',1);
            end
            buffer.append_string(tmp);
         end;
      end;

end
