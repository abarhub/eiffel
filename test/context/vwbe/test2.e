class TEST2

feature

	make is
	require
		true;
	do
	if true then
		coucou;
	elseif false then
		coucou;
	else
		coucou;
	end;
	from coucou;
	invariant false;
	until true
	loop
		coucou;
	end;
	check
		true;
		false;
	end;
	ensure
		true;
	end;

	coucou is
	do
	end;

invariant
	true;
	false;

end