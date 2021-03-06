class TEST1

creation make

feature

	make is
	local
	b:BOOLEAN;
	do
	-- test comparaison entier
	b:=5<7;
	b:=5<=7;
	b:=5=7;
	b:=5>=7;
	b:=5>7;
	b:=5/=7;

	-- test comparaison
	b:=14<15;
	b:=15<15;
	b:=16<15;
	b:=14<=15;
	b:=15<=15;
	b:=16<=15;
	b:=14=15;
	b:=15=15;
	b:=16=15;
	b:=14>=15;
	b:=15>=15;
	b:=16>=15;
	b:=14>15;
	b:=15>15;
	b:=16>15;
	b:=14/=15;
	b:=15/=15;
	b:=16/=15;

	-- test avec objets
	test2;

	-- test avec expanded
	test3;

	-- test avec equals
	test4;
	end;

	test2 is
	local
	a,a2:A;
	b:BOOLEAN;
	do
	!!a.make;
	!!a2.make;
	b:=a=a;
	b:=a2=a2;
	b:=a=a2;
	b:=a2=a;
	b:=a/=a2;
	b:=a2/=a;
	b:=a/=a;
	b:=a2/=a2;
	end;

	test3 is
	local
	a,a2:A2;
	b:BOOLEAN;
	a3:A;
	do
	a.make(5);
	a2.make(7);
	b:=a=a2;
	b:=a=a;
	b:=a2=a2;
	b:=a/=a2;
	b:=a/=a;
	b:=a2/=a2;
	!!a3.make;
	a.make2(a3);
	!!a3.make;
	a2.make2(a3);
	b:=a=a2;
	b:=a=a;
	b:=a2=a2;
	b:=a/=a2;
	b:=a/=a;
	b:=a2/=a2;
	a2.make2(a.a);
	b:=a=a2;
	b:=a=a;
	b:=a2=a2;
	b:=a/=a2;
	b:=a/=a;
	b:=a2/=a2;
	a2.make(2+3);
	b:=a=a2;
	b:=a=a;
	b:=a2=a2;
	b:=a/=a2;
	b:=a/=a;
	b:=a2/=a2;
	-- test si une reference est differente
	b:=a=a2;
	b:=a/=a2;
	!!a3.make;
	a2.make2(a3);
	b:=a=a2;
	b:=a/=a2;
	end;

	test4 is
	local
	i,j:INTEGER;
	ir,jr:INTEGER_REF;
	a:ANY;
	b:BOOLEAN;
	a2,a3:A2;
	a4:A;
	do
	b:=i.conforms_to(i);
	b:=j.conforms_to(j);
	b:=i.conforms_to(j);
	b:=j.conforms_to(i);
	!!ir;
	b:=ir.conforms_to(ir);
	b:=i.conforms_to(ir);
	b:=ir.conforms_to(i);
	!!a;
	b:=a.conforms_to(i);
	b:=i.conforms_to(a);
	-- test is_equal
	b:=a2.is_equal(a2);
	b:=a3.is_equal(a3);
	b:=a2.is_equal(a3);
	b:=a3.is_equal(a2);
	a2.make(5);
	b:=a2.is_equal(a2);
	b:=a2.is_equal(a3);
	b:=a3.is_equal(a2);
	!!a4.make;
	a2.make2(a4);
	b:=a2.is_equal(a2);
	b:=a2.is_equal(a3);
	b:=a3.is_equal(a2);
	a3.make(5);
	b:=a2.is_equal(a2);
	b:=a2.is_equal(a3);
	b:=a3.is_equal(a2);
	a3.make2(a4);
	b:=a2.is_equal(a2);
	b:=a2.is_equal(a3);
	b:=a3.is_equal(a2);
	!!a4.make;
	a3.make2(a4);
	b:=a2.is_equal(a2);
	b:=a2.is_equal(a3);
	b:=a3.is_equal(a2);

	-- test equal
	a3.make2(a2.a);
	a3.make(a2.i);
	b:=equal(a2,a2);
	b:=equal(a3,a3);
	b:=equal(a2,a3);
	b:=equal(a3,a2);
	a3.make(0);
	b:=equal(a2,a2);
	b:=equal(a3,a3);
	b:=equal(a2,a3);
	b:=equal(a3,a2);
	!!a4.make;
	a3.make2(a4);
	b:=equal(a2,a2);
	b:=equal(a3,a3);
	b:=equal(a2,a3);
	b:=equal(a3,a2);
	a3.make2(a2.a);
	a3.make(a2.i);
	b:=equal(a2,a2);
	b:=equal(a3,a3);
	b:=equal(a2,a3);
	b:=equal(a3,a2);
	end;

end