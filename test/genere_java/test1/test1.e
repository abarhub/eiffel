class TEST1

creation make

feature

	make is
	do
	func;
	func2(Void,Void);
	func3;
	func4("ABC");
	end;

	n:BOOLEAN is false;

	func is
	do
	end;

	func2(a,b:TEST1) is
	do
	end;

	func3 is
	external "JVM:Utils:static"
	alias "sortie"
	end;

	func4(s:STRING) is
	external "JVM:Utils:static"
	alias "sortie2"
	end;

	var1:B;
end