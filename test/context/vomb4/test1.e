class TEST1

creation make

feature

	make is
	local
	c:INTEGER;
	do
	inspect c
	when t1,t2 then
		cmd;
	else
		cmd;
	end;
	inspect c
	when t1..t3 then
		cmd;
	when t4 then
		cmd;
	else
		cmd;
	end;
	inspect c
	when t1..t3 then
		cmd;
	when t4,t5..t6 then
		cmd;
	else
		cmd;
	end;
	end;

	t1,t2,t3,t4:INTEGER is unique;
	t5,t6:INTEGER is unique;

	cmd is
	do
	end;

end