class TEST1

creation make

feature

	make is
	do
	toto;
	tata(8,5,6);
	test(6,7);
	test2(3);
	rien();
	tata(78,-23,4);
	rien;
	end;

	toto is
	do
	rien;
	end;

	tata(a,b,c:INTEGER) is
	do
	rien;
	end;
	
	test(a,b:INTEGER) is
	do
	rien;
	end;
	
	test2(a:INTEGER) is
	do
	rien;
	end;

	rien() is
	do
	end;

end