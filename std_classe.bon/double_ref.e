class DOUBLE_REF

inherit HASHABLE undefine is_equal end;
	NUMERIC;
	COMPARABLE undefine is_equal end;

feature

	item:DOUBLE;

	set_item(d:DOUBLE) is
	do
	item:=d;
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
	Result := (1.0).to_double;
	end;

	zero: like Current is
	do
	Result := (0.0).to_double;
	end;

	to_real:REAL is
	do
	--Result:=item.to_real;
	end;

end
