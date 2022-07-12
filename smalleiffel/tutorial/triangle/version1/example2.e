class EXAMPLE2

creation main
   
feature
   
   main is
      local
	 x, y, z: POINT;
	 t: TRIANGLE;
      do
	 create x;
	 x.translate(1.0 , 2.0);
	 
	 create y;
	 y.translate(3.0 , 4.0);
	 
	 create z;
	 z.translate(5.0 , 6.0);
	 
	 create t;
	 t.make(x,y,z);
	 t.translate(1,2);
	 sedb_breakpoint;
	 -- Do not forget to do: 
	 --         short POINT
	 -- and
	 --         short TRIANGLE
      end;
  
end
   
