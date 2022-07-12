class TEST2

creation make

feature

	make is
	local
	a:A;
	b:like a;
	c:like a;
	d:A;
	do
	a:=a;
	b:=b;
	c:=c;
	a:=b;
	b:=c;
	c:=b;
	b:=d;
	b:=a;
	-- les appel
	f(a,b1);
	f(b1,b1);
	g(a,a);
	g(a,b1);
	g(b1,b1);
	g(b1,a);
	h(a,a);
	h(a,b1);
	h(b1,b1);
	h(c1,c1);
	h(b1,a);
	h(c1,a);
	h(c1,b1);
	b1:=f1;
	c2:=f2(b1);
	c2:=c1.a1;
	c2:=c1.a2;
	end;

	b1:B;
	c1,c2:C;

	f(a:A;b:B) is
	do

	end;

	g(a:A;b:like a) is
	do

	end;

	h(a:ANY;b:like a) is
	do

	end;

	f1:like c1 is
	do
	end;

	f2(a:ANY):like a is
	do
	end;


end