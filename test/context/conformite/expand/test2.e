class TEST2

creation make

feature

	make is
	local
	a:A;
	b:B;
	c:C;
	a2:expanded A;
	b2:expanded B;
	do
	a:=a;
	b:=b;
	c:=c;
	a2:=a;
	a:=a2;
	a:=b2;
	-- les erreurs :
	a2:=b;
	end;

end