expanded class CHARACTER

inherit CHARACTER_REF
		redefine
			infix "<",hash_code,code
		end;

feature

	infix "<" (other: like Current): BOOLEAN is
	external "TinyEiffel"
	end;

	code:INTEGER is
	external "TinyEiffel"
	end;

	hash_code:INTEGER is
	do
	Result:=0;
	end;

end
