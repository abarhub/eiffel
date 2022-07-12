class TEST3

feature

	make is
	local
	i,j:INTEGER;
	do
	inspect i
	when 1+6,3/8 then
		coucou;
	when j then
		coucou;
	when f..9,11 then
		coucou;
	else
		coucou;
	end;
	end;

	f:INTEGER is
	do
	end;

	coucou is
	do
	end;

end