class TEST1

creation make

feature

	make is
	local
	a,i:INTEGER;
	do
	a:=5;
	f(8,6);
	debug("key1","key2")
		i:=a;
	end;
	if a=i then
		a:=a+1;
	else
		a:=i;
	end;
	from i:=0;
	until i>=52
	loop
		f(a,i);
		i:=i+1;
	end;
	check
		a>0;
		80-10=8;
	end;
	end;

	f(a,b:INTEGER) is
	local
	n:INTEGER;
	do
	n:=a+b;
	end;

end