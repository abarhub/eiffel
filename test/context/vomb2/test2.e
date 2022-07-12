class TEST2

feature

	make is
	local
	i,j:INTEGER;
	do
	inspect i
	when 1,3 then
		coucou;
	when 2 then
		coucou;
	when 4..9,11 then
		coucou;
	else
		coucou;
	end;
	end;

	coucou is
	do
	end;

end