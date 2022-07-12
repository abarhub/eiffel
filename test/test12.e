class TEST12

creation make

feature

	make is
	do
	end;

	toto is
	local
	i,j:INTEGER;
	do
	i:=0;
	j:=i;
	if true then
		i:=1;
	else
		i:=2;
	end;
	if true then
		i:=3;
	end;
	if true then
		i:=4;
	elseif false then
		i:=5;
	elseif true then
		i:=6;
	else
		i:=7;
	end;
	end;

	tata is
	local
	i,j:INTEGER;
	do
	from i:=0;
	until true
	loop
		i:=1;
	end;
	end;

	titi(i,j:INTEGER) is
	do
	f1(5).f3(1).titi(7,6);
	f1(9).f2.tata; -- erreur ???
	f1(9).tata;
	end;

	test1 is
	local
	t1,t2:TEST12;
	do
	t1:=f1(89);
	end;

	test2 is
	local
	i,j:INTEGER;
	b:BOOLEAN;
	do
	i:=- 89;
	b:=not b;
	end;

	test3 is
	local
	i,j:INTEGER;
	b:BOOLEAN;
	do
	i:=1+2;
	end;

	f1(i:INTEGER):TEST12 is
	do
	end;

	f2:TEST12 is
	do
	end;

	f3(a:INTEGER):TEST12 is
	do
	end;

end