class TEST2

creation make

feature

	make is
	local
	a,b:INTEGER;
	t:TEST2;
	do
	a:=n;
	b:=q;
	a:=b+n;
	a:=n+b;
	a:=not t;
	b:=t and a;
	end;

	n is
	do
	end;

	q is
	do
	end;

	prefix "not" is
	do
	end;

	infix "and"(a:INTEGER) is
	do
	end;

end