class TEST2

creation make

feature

	make is
	do
	i:=old i;
	end;

	test1 is
	require
		old i=i+1;
	do
	end;

	i,j:INTEGER;

	test2 is
	do
	ensure
		old (a+i)=i;
		old i=i+1;
		old (b+i)=i;
	end;

invariant
	old i=i;

end