class TEST1

creation make

feature

	make is
	do
	func4("ABC");
	end;

	func4(s:STRING) is
	external "JVM:Utils:static"
	alias "sortie"
	end;

end