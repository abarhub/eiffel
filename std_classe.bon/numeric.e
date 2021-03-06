deferred class NUMERIC

feature

	one:like Current is
	deferred
	end;

	zero:like Current is
	deferred
	end;

	divisible(other:like Current):BOOLEAN is
	require
		other/=Void;
	deferred
	end;

	exponentiable(other:NUMERIC):BOOLEAN is
	require
		other/=Void;
	deferred
	end;

	infix "+" (other:like Current):like Current is
	require
		other/=Void;
	deferred
	end;

	infix "-" (other:like Current):like Current is
	require
		other/=Void;
	deferred
	end;

	infix "*" (other:like Current):like Current is
	require
		other/=Void;
	deferred
	end;

	infix "/" (other:like Current):NUMERIC is
	require
		other/=Void;
	deferred
	end;

	infix "^" (other:NUMERIC):NUMERIC is
	require
		other/=Void;
	deferred
	end;

	prefix "+" :like Current is
	deferred
	end;

	prefix "-" :like Current is
	deferred
	end;

end