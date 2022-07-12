class TEST6

creation make

feature

	make is
	do
	!!a.make;
	!!a2.make;
	end;
	
	test(a:A) is
	do
	!!Result.make;
	!!a.make;
	end;

	a2:A;

end