class TEST1

creation make

feature

	make is
	local
	b:BOOLEAN;
	do
	func1("Test4");
	test1;
	test2;
	test3;
	test4;
	test5;
	end;

	test1 is
	do
	func1("fonction test1");
	end;

	test2 is
	local
	i:INTEGER;
	b:BOOLEAN;
	c:CHARACTER;
	r:REAL;
	do
	func1("fonction test2");
	i:=7;
	b:=false;
	c:='h';
	r:=9.4;
	func2(i);
	func3(b);
	func4(c);
	func5(r);
	end;

	test3 is
	do
	func1("fonction test 3");
	if true then
		func1("true");
	else
		func1("false");
	end;
	if false then
		func1("true");
	else
		func1("false");
	end;
	end;

	test4 is
	local
	b:BOOLEAN;
	do
	func1("fonction test 4");
	b:=true;
	if b then
		func1("true");
	else
		func1("false");
	end;
	b:=false;
	if b then
		func1("true");
	else
		func1("false");
	end;
	end;

	test5 is
	local
	b:BOOLEAN;
	do
	func1("fonction test 5");
	b:=true;
	if b then
		func1("true");
	end;
	if true then
		func1("true2");
	end;
	end;

	func1(s:STRING) is
	external "JVM:Utils:static"
	alias "sortie"
	end;

	func2(s:INTEGER) is
	external "JVM:Utils:static"
	alias "sortiei"
	end;

	func3(s:BOOLEAN) is
	external "JVM:Utils:static"
	alias "sortieb"
	end;

	func4(s:CHARACTER) is
	external "JVM:Utils:static"
	alias "sortiec"
	end;

	func5(s:REAL) is
	external "JVM:Utils:static"
	alias "sortief"
	end;

--	func6(s:DOUBLE) is
--	external "JVM:Utils:static"
--	alias "sortied"
--	end;

--	func7(s:ANY) is
--	external "JVM:Utils:static"
--	alias "sortieo"
--	end;
end