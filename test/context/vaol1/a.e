deferred class A

feature

	f is
	deferred
	ensure
		old i=i+1;
	end;

	g is
	external "C"
	ensure
		old (1-i)=-2;
	end;

	i,j:INTEGER;

end