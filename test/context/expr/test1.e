class TEST1

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
	-- elements simples
	a:=1;
	c:=' ';
	s:="coucou a tous";
	bool:=true;
	bool:=false;
	r:=5.2;
	d:=7.35;
	any:=Void;
	
	-- operateurs :

	-- INTEGER
	a:=70+45;
	a:=9-6;
	b:=a*6;
	--d:=93/42;
	a:=-b;
	a:=-365;
	a:=+759;
	
	-- REAL
	r:=70.0+.45;
	r:=r-6.123;
	r:=9.453*6.12;
	dr:=93.23/42.75;
	r:=-r;
	r:=-0.365;
	r:=+7.59;

	-- DOUBLE
	d:=d+.45;
	d:=70.0-6.123;
	d:=9.453*6.12;
	dr:=93.23/42.75;
	d:=-d;
	d:=-0.365;
	d:=+7.59;

	-- STRING
	s:="aaa"+"bbb";

	-- BOOLEAN
	bool:=true and false;
	bool:=bool or false;
	bool:=bool xor false;
	bool:=true implies false;
	bool:= not bool;

	bool:=a>=5;
	bool:=a>5;
	bool:=a=5;
	bool:=a<=5;
	bool:=a<5;
	bool:=a/=5;

	bool:=c>='A';
	bool:=c>'A';
	bool:=c='A';
	bool:=c<='A';
	bool:=c<'A';
	bool:=c/='A';
	
	bool:=r>=.26;
	bool:=r>.26;
	bool:=r=.26;
	bool:=r<=.26;
	bool:=r<.26;
	bool:=r/=.26;

	bool:=d>=.26;
	bool:=d>.26;
	bool:=d=.26;
	bool:=d<=.26;
	bool:=d<.26;
	bool:=d/=.26;
	
	bool:=s>="salut";
	bool:=s>"salut";
	bool:=s="salut";
	bool:=s<="salut";
	bool:=s<"salut";
	bool:=s/="salut";
	end;

	test1 is
	local
	t1,t2:ARRAY[INTEGER];
	do
	--t1:=<<1,2,3>>;
	end;

	test2 is
	local
	i,j:INTEGER;
	t1,t2:TEST1;
	a0:A;
	b0:B;
	do
	i:=t1.bn;
	i:=t1.an.bn;
	i:=a0.n;
	i:=a0.toto.n;
	i:=a0.tata.n;
	i:=a0.toto.toto.tata.toto.n;
	i:=a0.titi.i;
	i:=a0.tata.titi.test1.i;
	i:=a0.toto.titi.test2.a.n;
	i:=a0.titi.test1.test1.a.n;
	i:=a0.f(1,2).n;
	i:=a0.f(1,2).f(0,0).n;
	i:=b0.g(80).i;
	i:=b0.g(1).a.f(7,3).n;
	end;

	an:TEST1;
	bn:INTEGER;

end