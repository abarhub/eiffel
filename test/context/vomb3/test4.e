class TEST4

creation make

feature

	make is
	local
	c:INTEGER;
	do
	inspect c
	when 1,2 then
		cmd;
	else
		cmd;
	end;
	inspect c
	when 1,2,91 then
		cmd;
	when 92 then
		cmd;
	else
		cmd;
	end;
	inspect c
	when 10,11,12,13,14 then
		cmd;
	when 17..26 then
		cmd;
	else
		cmd;
	end;
	inspect c
	when 16..18 then
		cmd;
	when 1..15 then
		cmd;
	else
		cmd;
	end;
	inspect c
	when 0..26 then
		cmd;
	when 15..10 then
		cmd;
	else
		cmd;
	end;
	inspect c
	when 1..15 then
		cmd;
	when t1,t2 then
		cmd;
	else
		cmd;
	end;
	end;

	t1:INTEGER is 90;
	t2:INTEGER is 26;

	cmd is
	do
	end;

end