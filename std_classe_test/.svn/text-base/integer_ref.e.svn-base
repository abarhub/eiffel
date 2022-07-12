class INTEGER_REF

inherit COMPARABLE;
	HASHABLE undefine is_equal end;
	NUMERIC undefine is_equal end;

feature

	item:INTEGER;

	set_item(i:INTEGER) is
	do
	item:=i;
	end;

	infix "<" (other:like Current):BOOLEAN is
	do
	Result:=other.item<item;
	end;

	hash_code:INTEGER is
	do
	Result:=item.hash_code;
	end;

	infix "+" (other: like Current):like Current is
	do
	Result:=other.item+item;
	end

	infix "-" (other: like Current):like Current is
	do
	Result:=other.item-item;
	end

	infix "*" (other: like Current):like Current is
	do
	Result:=other.item*item;
	end

	infix "/" (other: like Current):DOUBLE is
	do
	Result:=other.item/item;
	end

	infix "^" (other: INTEGER):like Current is
	external "TinyEiffel"
	end

	prefix "+" :like Current is
	external "TinyEiffel"
	end

	prefix "-" :like Current is
	external "TinyEiffel"
	end

	infix "//" (other: like Current): like Current is
	external "tinyeiffel"
	end;

	infix "\\" (other: like Current): like Current is
	external "tinyeiffel"
	end;

	divisible(other: like Current): BOOLEAN is
	do
	Result:=other.item/=0;
	end;

	exponentiable(other:NUMERIC):BOOLEAN is
	do
	end;

	one: like Current is
	do
	Result := 1;
	end;

	zero: like Current is
	do
	Result := 0;
	end;

end
