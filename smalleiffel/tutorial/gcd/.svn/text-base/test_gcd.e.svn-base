class TEST_GCD
   --
   -- Have a look to INTEGER/gcd.
   --
   -- Note: SmallEiffel handle recursivity in assertions.
   --
creation {ANY}
   make

feature {ANY}

   make is
      do
         check
            (3).gcd(4) = 1;
            (4).gcd(4) = 4;
            (8).gcd(4) = 4;
            (9).gcd(8) = 1;
            (9).gcd(12) = 3;
         end;
      end;

end -- TEST_GCD
