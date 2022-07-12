class A

feature

	set_n(i:INTEGER) is
	do
	n:=i;
	end;

	set_elt(a:A) is
	do
	elt:=a;
	end;

	n:INTEGER;
	elt:A;

end