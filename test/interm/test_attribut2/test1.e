class TEST1

creation make

feature

	make is
	do
	end;

	--a:A;
	--b:B;
	--c:C;
	--d:D;

	test_once is
	local
	a:A;
	once
	a:=Void;
	end;

	test_once2:B is
	local
	a:A;
	once
	a:=Void;
	Result:=Void;
	end;

end