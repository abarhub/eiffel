class TEST1

creation make

feature

	make is
	do
	func1("Test3");
	func2(5);
	func3(true);
	func4('D');
	func5(6.23);
	--func6(9.45);
	--func7(null);
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