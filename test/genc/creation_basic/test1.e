class TEST1

creation make

feature

	make is
	local
	i:INTEGER;
	a:A;
	b:B;
	do
	-- test appel expression
	!!a;
	--a.make;
	!!b.make;
	!!b.make2(7);
	end;

end