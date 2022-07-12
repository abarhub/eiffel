class TEST1

creation make

feature

	make is
	local
	c:CHARACTER;
	do
	inspect c
	when 'a','b' then
		cmd;
	else
		cmd;
	end;
	inspect c
	when 'a','b','a' then
		cmd;
	when 'b' then
		cmd;
	else
		cmd;
	end;
	inspect c
	when 'l','m','o','p','q' then
		cmd;
	when 'm'..'p' then
		cmd;
	else
		cmd;
	end;
	inspect c
	when 'l'..'q' then
		cmd;
	when 'n'..'z' then
		cmd;
	else
		cmd;
	end;
	inspect c
	when 'a'..'m' then
		cmd;
	when t1,t2 then
		cmd;
	else
		cmd;
	end;
	end;

	t1:CHARACTER is 'f';
	t2:CHARACTER is 'y';

	cmd is
	do
	end;

end