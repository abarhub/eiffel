class REAL_REF

inherit COMPARABLE undefine is_equal end;
	NUMERIC;
	HASHABLE undefine is_equal end;

feature

	item:REAL;

	set_item(v:REAL) is
	do
	item:=v;
	end;

	infix "<" (other:like Current):BOOLEAN is
	do
	Result:=item<other;
	end;

	hash_code:INTEGER is
	do
	Result:=item.hash_code;
	end;

	infix "+" (other: like Current):like Current is
	do
	Result:=item+other;
	end

	infix "-" (other: like Current):like Current is
	do
	Result:=item-other;
	end

	infix "*" (other: like Current):like Current is
	do
	Result:=item*other;
	end

	infix "/" (other: like Current):DOUBLE_REF is
	do
	Result:=item/other;
	end

	infix "^" (other: INTEGER):like Current is
	do
	Result:=item^other;
	end

	prefix "+" :like Current is
	do
	Result:=+item;
	end

	prefix "-" :like Current is
	do
	Result:=-item;
	end

	infix "//" (other: like Current): INTEGER is
	do
	Result:=item//other;
	end;

	infix "\\" (other: like Current): like Current is
	do
	Result:=item\\other;
	end;

	divisible(other: like Current): BOOLEAN is
	do
	Result:=other.item/=0.0;
	end;

	exponentiable(other:NUMERIC):BOOLEAN is
	do
	end;

	one: like Current is
	do
	Result := 1.0;
	end;

	zero: like Current is
	do
	Result := 0.0;
	end;

	to_double:DOUBLE is
	do
	end;

end
