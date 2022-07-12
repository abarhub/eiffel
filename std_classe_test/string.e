class STRING

inherit COMPARABLE;
	HASHABLE undefine is_equal end;

creation make

feature

	make(capacity:INTEGER) is
	do
	end;

	hash_code:INTEGER is
	do
	end;

	infix "<" (other:like Current):BOOLEAN is
	do
	end;

	infix "+" (other:STRING):STRING is
	external "tinyeiffel"
	end;

end