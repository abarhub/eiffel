class EXAMPLE1
   --
   -- To start with NUMBERs, just compile an run it :
   -- 
   --            compile -o example1 -boost example1
   --

creation make

feature

   make is
      local
         max, n1, n2: NUMBER;
      do
         max := Maximum_integer.to_number;
         io.put_string("The maximum integer value on this architecture is:%N%
                       %      max = ");
         io.put_number(max);
         io.put_string("%Nmax + max = ");
         io.put_number(max + max);
         io.put_string("%Nmax * max = ");
         io.put_number(max * max);
         io.put_string("%NDo you like NUMBERs ?%N");

         io.put_string("So have a look at NUMBERs division:%N");
         n1 := (2).to_number;
         n2 := (6).to_number;
         io.put_string("Assume n1 = ");
         io.put_number(n1);
         io.put_string("  and n2 = ");
         io.put_number(n2);
         io.put_string("  then  n1/n2 = ");
         io.put_number(n1 / n2);
         io.put_string("%NWith NUMBER, you always get the exact result.%N");
         io.put_string("%NDo you like NUMBERs ?%N%
                       %Have a look at example #2 to know more about NUMBERs%N");
      end;

end -- EXAMPLE1
