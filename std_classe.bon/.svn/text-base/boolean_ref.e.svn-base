class BOOLEAN_REF

inherit HASHABLE;

feature

	item:BOOLEAN;

	set_item(b:BOOLEAN) is
	do
	item:=b;
	end;

	hash_code:INTEGER is
	do
	Result:=0;
	end;

	prefix "not":like Current is
	do
	Result:=not item;
	end;

	infix "and" (other:like Current):like Current is
	do
	Result:=item and other;
	end;

	infix "and then" (other:like Current):like Current is
	do
	Result:=item and then other;
	end;

	infix "or" (other:BOOLEAN):like Current is
	do
	Result:=item or other;
	end;

	infix "or else" (other:like Current):like Current is
	do
	Result:=item or else other;
	end;

	infix "xor" (other:like Current):like Current is
	do
	Result:=item xor other;
	end;

	infix "implies" (other:like Current):like Current is
	do
	Result:=item implies other;
	end;

end
