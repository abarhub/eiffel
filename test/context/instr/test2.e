class TEST2

creation make

feature

	make is
	local
	a,i:INTEGER;
	do
	a0:=5;
	f0(8,6);
	f(8);
	f(8,9,10);
	f(8,'a');
	debug("key1","key2")
		i0:=a;
	end;
	if a+i then
		a0:=a+1;
	else
		a1:=i;
	end;
	from i0:=0;
	until i-52
	loop
		f0(a,i);
		i0:=i+1;
	end;
	check
		a+0;
		80-10=8;
	end;
	end;

	f(a,b:INTEGER) is
	do
	Result:=a+b;
	end;

end