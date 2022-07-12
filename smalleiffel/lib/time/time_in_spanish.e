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
expanded class TIME_IN_SPANISH
--
-- The Spanish format class for class TIME.
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
               s := "Dom";
            when 1 then
               s := "Lun";
            when 2 then
               s := "Mar";
            when 3 then
               s := "Mie";
            when 4 then
               s := "Jue";
            when 5 then
               s := "Vie";
            when 6 then
               s := "Sab";
            end;
         else
            inspect
               time.week_day
            when 0 then
               s := "Domingo";
            when 1 then
               s := "Lunes";
            when 2 then
               s := "Martes";
            when 3 then
               s := "Miercoles";
            when 4 then
               s := "Jueves";
            when 5 then
               s := "Viernes";
            when 6 then
               s := "Sabado";
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
               s := "Ene";
            when 2 then
               s := "Feb";
            when 3 then
               s := "Mar";
            when 4 then
               s := "Abr";
            when 5 then
               s := "May";
            when 6 then
               s := "Jun";
            when 7 then
               s := "Jul"
            when 8 then
               s := "Ago"
            when 9 then
               s := "Sep"
            when 10 then
               s := "Oct";
            when 11 then
               s := "Nov";
            when 12 then
               s := "Dic";
            end;
         else
            inspect
               time.month
            when 1 then
               s := "Enero";
            when 2 then
               s := "Febrero";
            when 3 then
               s := "Marzo";
            when 4 then
               s := "Abril";
            when 5 then
               s := "Mayo";
            when 6 then
               s := "Junio";
            when 7 then
               s := "Julio"
            when 8 then
               s := "Agosto"
            when 9 then
               s := "Septiembre"
            when 10 then
               s := "Octubre";
            when 11 then
               s := "Noviembre";
            when 12 then
               s := "Diciembre";
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
         time.year.append_in(buffer);
         buffer.extend(' ');
         time.hour.append_in(buffer);
         buffer.extend(':');
         time.minute.append_in(buffer);
         if not short_mode then
            buffer.extend(':');
            time.second.append_in(buffer);
         end;
      end;

end
