class TEST1

creation make

feature

	make is
	local
	i:INTEGER;
	b:B;
	do
	-- test appel expression
	i:=appel;
	i:=appel3(5);
	i:=appel4(7,4+2);
	-- test appel instruction
	appel2;
	appel5(8.1,'a');
	-- test appel pointé
	appel6.appel;
	appel7;
	!!b.make;
	i:=b.donne_int;
	i:=b.donne_int;
	end;

	appel:INTEGER is
	local
	j:INTEGER;
	do
	j:=5;
	Result:=8;
	end;

	appel2 is
	local
	k:INTEGER;
	do
	k:=43;
	end

	appel5(a:REAL;c:CHARACTER) is
	local
	k2:INTEGER;
	r:REAL;
	char:CHARACTER;
	do
	k2:=7;
	r:=a;
	char:=c;
	end

	appel3(a:INTEGER):INTEGER is
	do
	Result:=15;
	end

	appel4(c,d:INTEGER):INTEGER is
	do
	Result:=c*8;
	Result:=Result+2*d;
	end

	appel6:A is
	local
	j:INTEGER;
	do
	j:=5;
	!!Result.make;
	end;

	appel7 is
	local
	a2:A;
	do
	!!a2.make;
	a2.appel2(5.7).appel2(0.00).appel;
	a2.appel2(10.0).appel;
	end;

	appel8:B is
	do
	!!Result.make;
	end

end