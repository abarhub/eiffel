expanded class REAL

inherit REAL_REF
		redefine infix "<",hash_code,infix "+",infix "-",infix "*",
			infix "/",infix "^",prefix "+",prefix "-",infix "//",
			infix "\\",divisible,exponentiable,one,zero
	end;

feature

	infix "<" (other:like Current):BOOLEAN is
	external "tinyeiffel"
	end;

	hash_code:INTEGER is
	do
	Result:=0;
	end;

	infix "+" (other: like Current):like Current is
	external "TinyEiffel"
	end

	infix "-" (other: like Current):like Current is
	external "TinyEiffel"
	end

	infix "*" (other: like Current):like Current is
	external "TinyEiffel"
	end

	infix "/" (other: like Current):DOUBLE_REF is
	external "TinyEiffel"
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

	infix "//" (other: like Current): INTEGER is
	external "tinyeiffel"
	end;

	infix "\\" (other: like Current): like Current is
	external "tinyeiffel"
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


end