class TEST1

creation make

feature

	make is
	do
	ensure
		old i=i+1;
		old (i+j)=5;
	end;

	i,j:INTEGER;
	a:A;

end