class EXAMPLE2

creation main
   
feature
   
   main is
      local
	 t1, t2: TRIANGLE;
      do
	 create t1.make(
		       create {POINT}.make(1.0 , 2.0),
		       create {POINT}.make(3.0 , 4.0),
		       create {POINT}.make(5.0 , 6.0)
		       );
	 
	 t2 := t1.twin;
	 
	 check
	    t1 /= t2;
	    t1.is_equal(t2);
	 end;
	 
	 t2.copy(t1);
	 
	 io.put_string("[
			
            It is a good exercice to run this example with the
            garbage collector information enabled: 
            Type:
                   compile -gc_info -trace example2

                       ]");
      end;
  
end
   
