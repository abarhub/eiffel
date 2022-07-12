class TEST1

creation make

feature

	make is
	do
	end;

	test_affect is
	local
	a,b:ANY;
	do
	a:=b;
	end;

	test_appel is
	local
	a,a2:A;
	b:B;
	do
	a.toto;
	a2.tata2(a);
	--coucou_a_tous(a);
	end;


end