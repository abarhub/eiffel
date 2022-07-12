class TEST1

creation make

feature

	make is
	local
	i,j:INTEGER;
	do
	i:=8+9;
	j:=7-i;
	k:=i;
	end;

	toto:INTEGER is
	do
	Result:=753;
	end;

	tata(a:INTEGER):INTEGER is
	local
	b:INTEGER;
	do
	Result:=753;
	b:=426;
	end;

	k:INTEGER;

end