class TEST1

creation make

feature

	make is
	do
	toto;
	fin;
	toto;
	end;

	toto is
	do
	end;

	fin is
	once
	end;

	test2 is
	local
	a:C;
	i:INTEGER;
	do
	-- infix
	i:=a and 5;
	i:=a or 5;
	i:=a or else 5;
	i:=a and then 5;
	i:=a xor 5;
	i:=a implies 5;
	i:=a + 5;
	i:=a - 5;
	i:=a * 5;
	i:=a / 5;
	i:=a // 5;
	i:=a \\ 5;
	i:=a > 5;
	i:=a >= 5;
	i:=a < 5;
	i:=a <= 5;
	i:=a ^ 5;
	-- prefix
	i:=not a;
	i:=+ a;
	i:=- a;
	-- infix free op
	i:=a @ 5;
	i:=a | 5;
	i:=a & 5;
	i:=a # 5;
	i:=a @azerty 5;
	-- prefix free op
	i:=@ a;
	i:=| a;
	i:=& a;
	i:=# a;
	i:=@azerty a;
	end;

end