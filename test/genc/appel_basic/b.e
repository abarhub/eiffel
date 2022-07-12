class B

creation make

feature

	make is
	local
	k2:INTEGER;
	do
	k2:=100;
	end

	donne_int:INTEGER is
	do
	Result:=var;
	var:=var+2;
	end;

	var:INTEGER;

end