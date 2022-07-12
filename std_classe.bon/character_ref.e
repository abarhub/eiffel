class CHARACTER_REF

inherit HASHABLE undefine is_equal end;
	COMPARABLE;

feature

	item:CHARACTER;

	set_item(c:CHARACTER) is
	do
	item:=c;
	end;

	infix "<" (other:like Current):BOOLEAN is
	do
	Result:=item<other;
	end;

	code:INTEGER is
	do
	Result:=item.code;
	end;

	hash_code:INTEGER is
	do
	Result:=item.hash_code;
	end;


end
