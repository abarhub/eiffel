class A

creation make

feature

	make is
	local
	k:INTEGER;
	do
	k:=37;
	end

	appel is
	local
	var:INTEGER;
	do
	var:=89;
	end

	var2:INTEGER;

	appel2(a:REAL):A is
	do
	--a:=46.7;
	var2:=var2+10;
	Result:=Current;
	end

end