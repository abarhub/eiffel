class TEST4

feature

	a is
	obsolete "coucou a tous"
	do
	end;
	
	b is
	require
		true;
	do
	ensure
		false;
	end;

	frozen a is
	do
	rescue
		a:=1;
	end;

end