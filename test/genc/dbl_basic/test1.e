class TEST1

creation make

feature

	make is
	local
	i:INTEGER;
	b:BOOLEAN;
	d:DOUBLE;
	do
	-- test double
	d:=5.0;
	d:=5.5+6.1;
	d:=d*10.8;
	d:=d-6.9;
	b:=d<9.8;
	i:=d//2.5;
	--r:=r\\10.7;
	d:=+d;
	d:=-d;
	end;

end