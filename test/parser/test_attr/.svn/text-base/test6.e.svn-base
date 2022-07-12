class TEST6

feature 

	a is
	obsolete "coucou"
	require
		false;
	do
	ensure
		true;
	rescue
		a:=2;
	end;

	a1 is
	obsolete "coucou2"
	require
		a=b;
	external "C" alias "tata"
	ensure
		b=a;
	rescue
		x:=y;
	end;

	d2 is
	obsolete "coucou3"
	require
		1=2;
	deferred
	ensure
		5/=6;
	end;

end