class TEST1

creation make

feature

	make is
	local
	a,b:INTEGER;
	t:TEST1;
	do
	a:=n;
	b:=q;
	a:=not t;
	b:=t and a;
	end;

	n:INTEGER;
	q:INTEGER;

	prefix "not":INTEGER is
	do
	end;

	infix "and"(a:INTEGER):INTEGER is
	do
	end;

end