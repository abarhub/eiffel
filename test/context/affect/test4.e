class TEST4

creation make

feature

	make is
	local
	i,j:INTEGER_REF;
	do
	Current?=Void;
	j?=Void;
	k?=Void;
	p?=Void;
	end;

	k:INTEGER_REF is
	do
	end;

	--j:INTEGER_REF is unique;
	p:INTEGER_REF is 
	once
	end;

	tata(a:INTEGER_REF):INTEGER_REF is
	do
	Result?=753;
	a?=426;
	end;

end