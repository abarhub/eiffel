class TEST10

feature

	a is
	do
	from 
	until i=0
	loop
		
	end;
	from 
	until i=0
	loop
		x:=2;
	end;
	from x:=0;
	until i=0
	loop
		x:=6;
	end;
	from x:=0;
	variant x-9
	until i=0
	loop
		x:=6;
	end;
	from x:=0;
	invariant
		x=1;
		y<2;
	until i=0
	loop
		x:=6;
	end;
	from x:=0;
	invariant
		x=1;
		y<2;
	variant x-y
	until i=0
	loop
		x:=6;
	end;
	end

end