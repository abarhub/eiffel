class TEST1

creation make

feature

	make is
	do
	end;

--	test_affect is
--	local
--	a,b:ANY;
--	do
--	a:=b;
--	end;

--	test_appel is
--	local
--	a,a2:A;
--	b:B;
--	do
--	a.toto;
--	a2.tata(a);
--	coucou_a_tous(a,b);
--	a.titi(Void).toto;
--	a.titi(a2).titi(a).toto;
--	k.test0;
--	end;

--	test_tent_affect is
--	local
--	a:A;
--	b:B;
--	do
--	b?=a;
--	end;

--	test_creation is
--	local
--	a:A;
--	b:B;
--	do
--	!!a;
--	!!b.tata2;
--	end;

	test_if is
	local
	a:A;
	b:B;
	do
	if a=a then
		b:=Void;
	end;
	if b=a then
		b:=Void;
	else
		a:=Void;
	end;
	if a=b then
		b:=Void;
	elseif b=b then
		a:=b;
	else
		a:=Void;
	end;
	end;

	test_loop is
	local
	a:A;
	b:B;
	do
	from a:=Void;
	until b=b
	loop
		a:=b;
	end;
	end;

	test_inspect is
	local
	a:A;
	b:B;
	i:INTEGER;
	do
	inspect i
	when 0,2 then
		a:=Void;
	else
		b:=Void;
	end;
	inspect i
	when 0,2,5..9 then
		a:=Void;
	else
		b:=Void;
	end;
	end;

	test_rescue is
	local
	a,b:ANY;
	do
	a:=b;
	rescue
	b:=a;
	end;

	test_retry is
	local
	a,b:ANY;
	do
	a:=b;
	rescue
	b:=a;
	retry;
	end;

	test_check is
	local
	i:INTEGER;
	do
	check
		i=0;
	end;
	end;

	test_debug is
	local
	i:INTEGER;
	do
	debug
		i:=0;
	end;
	debug("a","b")
		i:=2;
	end;
	end;

	test_pre is
	require
		k/=k;
	do
	end;

	test_post(c:C) is
	local
	a:A;
	do
	ensure
		k+k/=c;
		a=a;
	end;

	coucou_a_tous(i,j:ANY) is
	do
	end;

	k:INTEGER;

end