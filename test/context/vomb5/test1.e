class TEST1

creation make

feature

	make is
	local
	i:INTEGER;
	do
	inspect i
	when 5,9 then
		toto;
	when a,b then
		toto;
	end;
	inspect i
	when t,-9,7,-3 then
		toto;
	when t2,b then
		toto;
	end;
	end;

	toto is
	do
	end;

	a,b:INTEGER is unique;
	t:INTEGER is 10;
	t2:INTEGER is -29;

end