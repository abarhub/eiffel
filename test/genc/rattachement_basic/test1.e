class TEST1

creation make

feature

	make is
	--pose probl�me (erreur assert dans java) :
	--a.copy(a2.copy);
	local
	i:INTEGER;
	a,a2:A;
	b,b2:B;
	do
	-- test 1
	a:=a2;
	!!a2;
	a2.set(5);
	a:=a2;
	i:=a.n;
	a2.set(20);
	i:=a.n;

	-- test 2
	!!a;
	!!a2;
	a2.set(13);
	i:=a.n;
	i:=a2.n;
	a.copy(a2);
	i:=a.n;
	i:=a2.n;

	-- test 3
	a2.set(24);
	i:=a.n;
	i:=a2.n;
	a:=a2.twin;
	i:=a.n;
	i:=a2.n;
	a2.set(15);
	i:=a.n;
	i:=a2.n;
	end;

end