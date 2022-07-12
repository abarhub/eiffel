class GENERAL

feature

	generating_type:STRING is
	external "tinyeiffel"
	end;

	generator:STRING is
	external "tinyeiffel"
	end;

	frozen equal,frozen standard_equal(a: ANY; b: like a): BOOLEAN is
	--frozen equal,frozen standard_equal(a: ANY; b: ANY): BOOLEAN is
	do
	if a = b then
		Result := true;
	elseif a = Void then
	elseif b = Void then  -- erreur du compilo (like a pas compatible avec NONE)
	else
		Result := a.is_equal(b);
	end;
	end;

	is_equal,frozen standard_is_equal(other: like Current): BOOLEAN is
	external "tinyeiffel"
	end;

	frozen clone,frozen standard_clone(a: ANY): like a is
	do
	if a /= Void then
		Result := a.twin;  -- erreur du compilo (like a pas compatible avec like current)
	end;
	end;

	frozen twin,frozen standard_twin: like Current is
	external "tinyeiffel"
	end;

	copy,frozen standard_copy(other: like Current) is
	external "tinyeiffel"
	end;

	io:STD_FILE is
	once
	!!Result.make;
	end;

	out:STRING is
	do
	end;

	frozen Void:NONE is
	do
	end;

	conforms_to(other:GENERAL):BOOLEAN is
	external "tinyeiffel"
	end;

end