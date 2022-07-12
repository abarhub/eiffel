class TEST2

creation make

feature

	make is
	local
	a,b:INTEGER;
	i,j:INTEGER;
	c:CHARACTER;
	s:STRING;
	bool:BOOLEAN;
	r:REAL;
	d:DOUBLE;
	any:ANY;
	dr:DOUBLE_REF;
	do
	i:=a and b;
	i:=a or b;
	i:=a xor b;
	i:= a implies b;
	--i:=and a;
	--i:=a not b;
	i:=a0+b;
	i:=a+b0;
	i:=f;
	i:=f(a,b);
	i:=f(a0,b);
	i:=f(a,b0);
	i:=f(a);
	i:=f(a,b,a);
	bool:=r=r;
	bool:=a=i;
	bool:=a/=i;
	bool:=a=c;
	bool:=a/=c;
	i:=rien;
	i:=a+rien;
	i:=rien+a;
	i:=rien2(0);
	i:=a+rien2(0);
	i:=rien2(0)+a;
	end;

	f(a,b:INTEGER):INTEGER is
	do
	Result:=a+b;
	end;

	rien is
	do
	end;

	rien2(a:INTEGER) is
	do
	end;

	test1 is
	local
	t1,t2:ARRAY[INTEGER];
	do
	--t1:=<<f,f,f(7,6,8)>>;
	end;

	test2 is
	local
	i,j:INTEGER;
	t1,t2:TEST1;
	a0:A;
	b0:B;
	do
	i:=t1.x;
	i:=t1.a.bn;
	i:=a0.i;
	i:=a0.toto.n;
	i:=a0.tata.n0;
	i:=a0.toto.toto.tata.toto.n;
	i:=a0.titi.i0;
	i:=a0.tata.titi.test.i;
	i:=a0.toto.titi.test2.a0.n;
	i:=a0.titi.test1a.test1.a.n;
	i:=a0.f(1).n;
	i:=a0.f.n;
	i:=a0.f(1,2,3).f(0,0).n;
	i:=b0.g(80,63).i;
	i:=b0.g(1).a.f(7,'a').n;
	i:=b0.g.i;
	i:=b0.g(q).i;
	i:=a0.f0(0,1).n;
	end;

	an:TEST1;
	bn:INTEGER;


end