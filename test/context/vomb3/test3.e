class TEST3

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
	when 1,2,1 then
		cmd;
	when 2 then
		cmd;
	else
		cmd;
	end;
	inspect c
	when 4,5,6,7,8 then
		cmd;
	when 5..8 then
		cmd;
	else
		cmd;
	end;
	inspect c
	when 9..13 then
		cmd;
	when 10..43 then
		cmd;
	else
		cmd;
	end;
	inspect c
	when 1..20 then
		cmd;
	when t1,t2 then
		cmd;
	else
		cmd;
	end;
	end;

	t1:INTEGER is 7;
	t2:INTEGER is 23;

	cmd is
	do
	end;

end