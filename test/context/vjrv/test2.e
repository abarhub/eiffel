class TEST2

feature

	make is
	local
	i,j:INTEGER;
	a:ANY;
	p:INTEGER_REF;
	do
	p?=5;
	p?=j;
	p?=i;
	a?=i;
	p?=a;
	end;

end